package com.education.service;

import com.education.pojo.TZbHomeround;

import java.util.List;

public interface HomeService {

    List<TZbHomeround> getHmoeroundList();

    int saveHomeImages(TZbHomeround homeround);

    int deleteHomeImages(int id);
}
