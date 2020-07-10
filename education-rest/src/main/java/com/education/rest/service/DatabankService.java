package com.education.rest.service;

import com.education.pojo.TZbDatabank;
import com.education.util.PagePortal;

import java.util.List;

public interface DatabankService {
    PagePortal getDatabankList(String que, int page, int rows);

    int updateDatabank(int id);

    List<TZbDatabank> getDatabankTopList(String top, int page, int rows);

}
