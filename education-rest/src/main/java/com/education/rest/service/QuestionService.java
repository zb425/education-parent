package com.education.rest.service;

import com.education.pojo.TZbDiscussion;
import com.education.pojo.TZbDiscussionCircle;
import com.education.util.PagePortal;

public interface QuestionService {

    PagePortal getQuestionList(int page, int rows);

    int updateQuestion(int id);

    PagePortal getQuestionRedList(int id, int page, int rows);

    TZbDiscussion getQuestionID(int id);

    int saveQuestionRed(TZbDiscussionCircle discussionCircle);

    int saveQuestionList(TZbDiscussion discussion);
}
