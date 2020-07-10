package com.education.service;

import com.education.pojo.TZbUser;
import com.education.util.PageInfoShow;

public interface UserService {
    PageInfoShow getAllUser(int page, int rows, String name, int status);

    TZbUser getUserID(int id);

    int updateUser(TZbUser user);

    int deleteUser(int id);

    int saveUser(TZbUser user);

    TZbUser getUserToUsername(String username);

    int updateToUser(TZbUser user);
}
