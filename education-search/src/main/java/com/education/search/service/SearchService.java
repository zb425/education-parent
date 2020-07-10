package com.education.search.service;

import com.education.search.pojo.SearchResult;

public interface SearchService {
    SearchResult search(String queryString, int page, int rows) throws Exception;
}
