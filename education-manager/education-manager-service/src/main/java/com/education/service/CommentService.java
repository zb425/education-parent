package com.education.service;


import com.education.util.PageInfoShow;

public interface CommentService {
    PageInfoShow getCommentList(int page, int rows, String name);

    int deleteCommentOntoTow(String[] comment);
}
