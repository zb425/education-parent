package com.education.portal.service.impl;

import com.education.portal.service.DatabankService;
import com.education.util.HttpClientUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DatabankServiceImpl implements DatabankService {
    @Value("${REST_BASE_URL}")
    private String REST_BASE_URL;
    @Value("${REST_DATABANK_URL}")
    private String REST_DATABANK_URL;
    @Value("${REST_DATABANK_UPDATE_URL}")
    private String REST_DATABANK_UPDATE_URL;
    @Value("${REST_DATABANK_TOP_URL}")
    private String REST_DATABANK_TOP_URL;

    @Override
    public String getDatabankList(String que, String page) {
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_DATABANK_URL+que+"/"+page);
        return json;
    }

    @Override
    public String updateDatabank(String id) {
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_DATABANK_UPDATE_URL+id);
        return json;
    }

    @Override
    public String getDatabankTopList(String top) {
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_DATABANK_TOP_URL+top);
        return json;
    }
}
