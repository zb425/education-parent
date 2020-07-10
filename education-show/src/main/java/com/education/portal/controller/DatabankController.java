package com.education.portal.controller;

import com.education.pojo.TZbDatabank;
import com.education.portal.service.DatabankService;
import com.education.util.EducationResult;
import com.education.util.JsonUtils;
import com.education.util.PagePortal;
import org.apache.commons.net.util.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

@Controller
@RequestMapping("/databanks")
public class DatabankController {
    @Autowired
    private DatabankService databankService;

    @RequestMapping("/getDatabankList")
    public String getDatabankList(Model model, @RequestParam("que") String que, @RequestParam(value = "page", defaultValue = "1") Integer page) {
        String json = databankService.getDatabankList(que, String.valueOf(page));
        EducationResult educationResult = EducationResult.formatToPojo(json, PagePortal.class);
        PagePortal pagePortal = (PagePortal) educationResult.getData();

        String json1=databankService.getDatabankTopList("time");
        EducationResult educationResult1= EducationResult.formatToList(json1, TZbDatabank.class);
        List<TZbDatabank> databanks=(List<TZbDatabank>)educationResult1.getData();

        String json2=databankService.getDatabankTopList("count");
        EducationResult educationResult2= EducationResult.formatToList(json2, TZbDatabank.class);
        List<TZbDatabank> databanks2=(List<TZbDatabank>)educationResult2.getData();

        model.addAttribute("databankTime",databanks);
        model.addAttribute("databankCount",databanks2);
        model.addAttribute("databank", pagePortal);
        return "databanks/databankIndex";
    }

   /* @RequestMapping(value = "/updateDatabank",method = RequestMethod.POST)
    @ResponseBody*/
    public String updateDatabank(Integer id){
        String json=databankService.updateDatabank(String.valueOf(id));
        EducationResult educationResult= EducationResult.format(json);
        int i=(int)educationResult.getData();
        if(i>0){
            return JsonUtils.objectToJson(1);
        }
        return JsonUtils.objectToJson(0);
    }

        @RequestMapping(value = "/downloadDatabank")
        @ResponseBody
        public String downloadDatabank (@RequestParam("name") String name,@RequestParam("id") Integer id, HttpServletRequest request, HttpServletResponse
        response) throws Exception {

            try {
                String fileurl = "http://localhost:8080/databank/" +name+"";
                //String fileurl = "http://服务器ip/files/document/用户.txt" ;
                URL url = new URL(fileurl);
                HttpURLConnection urlc = (HttpURLConnection) url.openConnection();
                urlc.setRequestProperty("Content-type", "application/x-www-form-urlencoded;charset=UTF-8");
                urlc.setRequestProperty("Accept-Language", "zh-CN");
                // 设置字符编码
                urlc.setRequestProperty("Charset", "UTF-8");
                String realname = name;
                //将文件读入文件流
                //InputStream inStream = urlc.getInputStream();
                BufferedInputStream inputStream=new BufferedInputStream(urlc.getInputStream());
                //设置浏览器代理信息
                String agent = request.getHeader("USER-AGENT");
                //判断浏览器代理并分别设置响应给浏览器的编码格式
                String finalFileName = null;
                if (agent != null && agent.indexOf("MSIE") == -1) {
                    realname = "=?UTF-8?B?" + (new String(Base64.encodeBase64(realname.getBytes("UTF-8")))) + "?=";
                    response.setHeader("content-disposition", "attachment;filename=" + realname );
                } else { // IE  
                    response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(realname, "UTF-8"));
                }
                // 循环取出流中的数据
                byte[] b = new byte[1024];
                int len;
                while ((len = inputStream.read(b)) > 0) {
                    response.getOutputStream().write(b, 0, len);
                }
                //inStream.close();
                inputStream.close();
                response.getOutputStream().close();
                urlc.disconnect();

                updateDatabank(id);

            } catch (Exception e) {
                e.printStackTrace();
            }
            return JsonUtils.objectToJson(1);
        }

}
