package com.education.service;

import com.education.pojo.TZbDatabank;
import com.education.util.PagePortal;

public interface DatabankService {

    PagePortal getDatabankList(String que, int page, int rows);

    int saveDatabank(TZbDatabank databank);

    int updateDatabank(int id);

    int deleteDatabank(int id);
}
