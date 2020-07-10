package com.education.service;

import com.education.pojo.TZbUser;

public interface LoginService {

    TZbUser getUser(String username, String password);
}
