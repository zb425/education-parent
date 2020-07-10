package com.education.search.service.impl;

import com.education.search.mapper.CourseMapper;
import com.education.search.pojo.SearchCourse;
import com.education.search.service.CourseService;
import com.education.util.EducationResult;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private SolrServer solrServer;
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public EducationResult importCourse() throws Exception {
        //查询数据库获得课程列表
        List<SearchCourse> itemList = courseMapper.getCourseList();
        for (SearchCourse item : itemList) {
            //创建文档对象
            SolrInputDocument document=new SolrInputDocument();
            //添加域
            document.addField("id", item.getZb_id());
            document.addField("course_name", item.getZb_name());
            document.addField("course_type_name", item.getZb_coursetype_name());
            document.addField("course_sub_name", item.getZb_sub_coursetype());
            document.addField("course_picture", item.getZb_picture());
            document.addField("course_study_count", item.getZb_study_count());
            document.addField("course_brief", item.getZb_brief());
            document.addField("course_username",item.getZb_username());
            document.addField("course_free",item.getZb_free());
            //写入索引库
            solrServer.add(document);
        }
        //提交
        solrServer.commit();
        return EducationResult.ok();
    }

    @Override
    public EducationResult synCourse() throws Exception {
        solrServer.deleteByQuery("*:*");
        solrServer.commit();
        return EducationResult.ok();
    }
}
