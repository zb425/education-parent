package com.education.portal.service;

import com.education.portal.pojo.SearchResult;

public interface SerachService {
    SearchResult search(String keyword, int page, int rows);
}
