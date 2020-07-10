package com.education.service;

import com.education.util.PagePortal;

public interface DiscussionService {

    PagePortal getDiscussionList(String que, int page, int rows);

    int deleteDiscussion(int id);

    int updateDIscussion(int id);

    PagePortal getDiscussionIDList(int id, int page, int rows);

    int deleteRedDiscussion(int id);

    int updateRedDiscussion(int id);
}
