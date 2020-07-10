package com.education.portal.service;

public interface DatabankService {

    String getDatabankList(String que, String page);

    String updateDatabank(String id);

    String getDatabankTopList(String top);
}
