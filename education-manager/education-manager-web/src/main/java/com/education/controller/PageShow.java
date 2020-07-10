package com.education.controller;

import com.education.pojo.*;
import com.education.service.CourseService;
import com.education.util.HttpClientUtil;
import com.education.util.JsonUtils;
import com.education.util.PageInfoShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.Calendar;
import java.util.List;


@RequestMapping("/user")
@Controller
public class PageShow {

    private final static  Integer rows=5;
    @Autowired
    private CourseService courseService;
    @Value("${SOLR_BASE_URL}")
    private String SOLR_BASE_URL;
    @Value("${SOLR_COURSE_SYN}")
    private String SOLR_COURSE_SYN;
    @Value("${SOLR_COURSE_IMPROTER}")
    private String SOLR_COURSE_IMPROTER;

    @RequestMapping("/show")
    public String showIndex(){
        return "/index";
    }

    @RequestMapping("/main")
    public ModelAndView showMain(){
        ModelAndView modelAndView=new ModelAndView("/main");
        String str="[";
        Calendar calendar=Calendar.getInstance();
       /* System.out.println(calendar.get(Calendar.YEAR)+"-"+calendar.get(Calendar.MONTH)+1+"-"+calendar.get(Calendar.DAY_OF_MONTH));*/
        for (int i=0;i<9;i++){
            str+="'"+(calendar.get(Calendar.MONTH)+1)+"-"+(calendar.get(Calendar.DAY_OF_MONTH)+i)+"'"+",";
        }
        str+="'"+(calendar.get(Calendar.MONTH)+1)+"-"+(calendar.get(Calendar.DAY_OF_MONTH)+9)+"'"+"]";
        modelAndView.addObject("categories",str);
        return modelAndView;
    }

    @RequestMapping("/course")
    public ModelAndView showCourse(@RequestParam("page") Integer page,@RequestParam("name") String name){
        ModelAndView modelAndView=new ModelAndView("/course/pagelist");
        PageInfoShow pageInfoShow=courseService.getAllCourse(page,rows,name);
        List<TZbCoursetype> list=courseService.getAllCourseType();
        List<TZbCourse> courseList=courseService.getCourse();
        modelAndView.addObject("classPage",list);
        modelAndView.addObject("page",pageInfoShow);
        modelAndView.addObject("allCourse",courseList);
        return modelAndView;
    }


    @RequestMapping(value = "/nameCourse",method = RequestMethod.POST)
    public ModelAndView showNameCourse(@RequestParam("name") String name, @RequestParam("page") Integer page){
        //System.out.println(name);
        ModelAndView modelAndView=new ModelAndView("/course/pagelist");
        if(name==null||name.equals("")){
            PageInfoShow pageInfoShow=courseService.getNameCourse(null,page,rows);
        }
        PageInfoShow pageInfoShow=courseService.getNameCourse(name,page,rows);
        modelAndView.addObject("page",pageInfoShow);
        return modelAndView;
    }

    @RequestMapping("/delete")
    public ModelAndView deleteCourseID(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("page") Integer page){
        ModelAndView modelAndView=new ModelAndView("/course/pagelist");

        HttpClientUtil.doGet(SOLR_BASE_URL+SOLR_COURSE_SYN);
        courseService.deleteCourseID(id);
        PageInfoShow pageInfoShow=courseService.getNameCourse(name,page,rows);
        HttpClientUtil.doGet(SOLR_BASE_URL+SOLR_COURSE_IMPROTER);
        modelAndView.addObject("page",pageInfoShow);
        return modelAndView;
    }


    @RequestMapping("/update")
    public ModelAndView updateCourseID(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("page") Integer page){
        ModelAndView modelAndView=new ModelAndView("/course/pagelist");
        HttpClientUtil.doGet(SOLR_BASE_URL+SOLR_COURSE_SYN);
        courseService.updateCourseID(id);
        PageInfoShow pageInfoShow=courseService.getNameCourse(name,page,rows);
        modelAndView.addObject("page",pageInfoShow);
        HttpClientUtil.doGet(SOLR_BASE_URL+SOLR_COURSE_IMPROTER);
        return modelAndView;
    }

    @RequestMapping("/read")
    public ModelAndView redCourse(@RequestParam("id") Integer id){
        ModelAndView modelAndView=new ModelAndView("/course/read");
        TZbCourse course=courseService.getCourse(id);
        List<TZbCourseSection> courseSections=courseService.getCourseSectionToPrent(course.getZbId());
        modelAndView.addObject("course",course);
        modelAndView.addObject("section",courseSections);
        return modelAndView;
    }

    //保存课程信息
    @RequestMapping(value = "/saveMerge",method = RequestMethod.POST)
    @ResponseBody
    public String saveMerge(@RequestParam(value = "file", required = false) MultipartFile file, TZbCourse course, HttpServletRequest request) throws  Exception{

        course.setZbPicture(file.getOriginalFilename());
        String path=request.getSession().getServletContext().getRealPath("upload");
        File tageFile=new File(path);
        if(!tageFile.exists()){
            tageFile.mkdirs();
        }
        tageFile=new File(path,file.getOriginalFilename());
        try {
            file.transferTo(tageFile);
        }catch (Exception e){
            e.printStackTrace();
        }
        courseService.insertCourse(course);
        return JsonUtils.objectToJson(1);
    }

    @RequestMapping(value = "/insertSections",method = RequestMethod.GET)
    public String insertSections(@RequestBody List<TZbCourseSection> batchSections){
        System.out.println("123456");
        System.out.println(batchSections.size()+"g123");
        return "0";
    }

    //根据章节id查找信息
    @RequestMapping(value = "/getCourseSectionID",method = RequestMethod.POST,produces ={"text/html;charset=UTF-8;"})
    @ResponseBody
    public String getCourseSection(Model model, @RequestParam(value = "cId") Integer cid, HttpServletResponse response){
            List<TZbCourseSection> list=courseService.getCourseSection(cid);
            return new JsonUtils().objectToJson(list);
    }

    //保存章节信息
    @RequestMapping(value = "/insertCourseSection",method = RequestMethod.POST)
    @ResponseBody
    public String insertCourseSection(TZbCourseSection courseSection){
        int i=courseService.insertCourseSection(courseSection);
        if(i>0){
            return new JsonUtils().objectToJson(1);
        }
        return new JsonUtils().objectToJson(0);
    }

    /*//保存章节信息
    @RequestMapping(value = "/saveCourseNextMessge",method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView saveCourseNextMessge(@RequestParam(value = "file", required = false) MultipartFile file,TZbCourseSection courseSection,HttpServletRequest request){
        ModelAndView modelAndView=new ModelAndView("/course/pagelist");

        FileEntity entity=new FileEntity();
        FileUploadTool uploadTool=new FileUploadTool();
        entity=uploadTool.createFile(file,request);
        if(entity!=null){
            courseSection.setZbVideoUrl(entity.getTitleAlter());
            courseService.insertCourseSection(courseSection);
        }
        *//*缓存同步*//*
        //HttpClientUtil.doGet(REST_BASE_URL+REST_COURSE_SECTION_SYNC_URL+courseSection.getZbCourseId());
        PageInfoShow pageInfoShow=courseService.getNameCourse("",1,rows);
        modelAndView.addObject("page",pageInfoShow);
        return modelAndView;
    }*/

    //保存章节信息
    @RequestMapping(value = "/saveCourseNextMessge",method = RequestMethod.POST)
    @ResponseBody
    public String saveCourseNextMessge(@RequestParam(value = "file", required = false) MultipartFile file, TZbCourseSection courseSection, HttpServletRequest request){
        ModelAndView modelAndView=new ModelAndView("/course/pagelist");

        FileEntity entity=new FileEntity();
        FileUploadTool uploadTool=new FileUploadTool();
        entity=uploadTool.createFile(file,request);
        String [] str=file.getContentType().split("/");
        if(entity!=null){
            courseSection.setZbVideoUrl(entity.getTitleAlter()+"."+str[str.length-1]);
            courseService.insertCourseSection(courseSection);
        }
        return JsonUtils.objectToJson(1);
    }


    @RequestMapping(value = "/courseNextUpdate",method = RequestMethod.POST,produces ={"text/html;charset=UTF-8;"})
    @ResponseBody
    public String courseNextUpdate(@RequestParam("id") Integer id){
       TZbCourseSection courseSections=courseService.getCouserSectionID(id);
       if(courseSections==null){
           return JsonUtils.objectToJson(1);
       }else{
           return JsonUtils.objectToJson(courseSections);
       }
    }

    @RequestMapping(value = "/updateCourseNext",method = RequestMethod.POST)
    @ResponseBody
    public String updateCourseNext(@RequestParam(value = "file", required = false) MultipartFile file, TZbCourseSection courseSection, HttpServletRequest request) throws  Exception{
        if(file.getOriginalFilename()!=null&&file.getOriginalFilename()!=""){
            courseSection.setZbVideoUrl(file.getOriginalFilename());
            String path=request.getSession().getServletContext().getRealPath("upload");
            File tageFile=new File(path);
            if(!tageFile.exists()){
                tageFile.mkdirs();
            }
            tageFile=new File(path,file.getOriginalFilename());
            try {
                file.transferTo(tageFile);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        int i=courseService.updateCourseSection(courseSection);
        if(i>0){
            return JsonUtils.objectToJson(1);
        }
        return JsonUtils.objectToJson(0);
    }

    @RequestMapping(value = "/courseNextDelete",method = RequestMethod.POST)
    @ResponseBody
    public String courseNextDelete(@RequestParam("data") String[] id){
        int i=courseService.deleteCourseSection(id);
        if(i>0){
            return JsonUtils.objectToJson(1);
        }else{
            return JsonUtils.objectToJson(0);
        }
    }

    @RequestMapping(value = "/deleteCourse",method = RequestMethod.POST)
    @ResponseBody
    public String deleteCourse(@RequestParam("id") Integer id){
        int i=courseService.deleteSectionID(id);
        if(i>0){
            return JsonUtils.objectToJson(1);
        }else{
            return JsonUtils.objectToJson(0);
        }
    }

    @RequestMapping(value = "/updateSection",method = RequestMethod.POST)
    @ResponseBody
    public String updateSection(TZbCourseSection courseSection){
        int i=courseService.updateSection(courseSection);
        if(i>0){
            return JsonUtils.objectToJson(1);
        }else{
            return JsonUtils.objectToJson(0);
        }
    }

}
