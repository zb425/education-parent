package com.education.search.dao.impl;

import com.education.search.dao.SearchDao;
import com.education.search.pojo.SearchCourse;
import com.education.search.pojo.SearchResult;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class SearchDaoImpl implements SearchDao {

    @Autowired
    private SolrServer solrServer;

    @Override
    public SearchResult search(SolrQuery query) throws Exception {
        //执行查询
        QueryResponse response = solrServer.query(query);
        SolrDocumentList solrDocumentList = response.getResults();
        List<SearchCourse> itemList = new ArrayList<>();
        for (SolrDocument solrDocument : solrDocumentList) {
            SearchCourse item=new SearchCourse();
            item.setZb_brief((String) solrDocument.get("course_brief"));
            item.setZb_id((String) solrDocument.get("id"));
            item.setZb_picture((String) solrDocument.get("course_picture"));
            item.setZb_study_count((Long) solrDocument.get("course_study_count"));
            item.setZb_sub_coursetype((String) solrDocument.get("course_sub_name"));
            item.setZb_coursetype_name((String) solrDocument.get("course_type_name"));
            item.setZb_username((String) solrDocument.get("course_username"));
            item.setZb_free((Long) solrDocument.get("course_free"));
            //取高亮显示
            Map<String, Map<String, List<String>>> highlighting = response.getHighlighting();
            List<String> list = highlighting.get(solrDocument.get("id")).get("course_name");
            String itemTitle = "";
            if (list != null && list.size() > 0) {
                //取高亮后的结果
                itemTitle = list.get(0);
            } else {
                itemTitle = (String) solrDocument.get("course_name");
            }
            item.setZb_name(itemTitle);
            //添加到列表
            itemList.add(item);
        }
        SearchResult result = new SearchResult();
        result.setCourseList(itemList);
        //查询结果总数量
        result.setRecordCount(solrDocumentList.getNumFound());
        return result;
    }
}
