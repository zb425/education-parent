package com.education.service.impl;

import com.education.mapper.TZbHomeroundMapper;
import com.education.pojo.TZbHomeround;
import com.education.pojo.TZbHomeroundExample;
import com.education.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private TZbHomeroundMapper homeroundMapper;
    @Override
    public List<TZbHomeround> getHmoeroundList() {
        TZbHomeroundExample homeroundExample=new TZbHomeroundExample();
        return homeroundMapper.selectByExample(homeroundExample);
    }

    @Override
    public int saveHomeImages(TZbHomeround homeround) {
        homeround.setZbCreateTime(new Date());
        homeround.setZbUpdateTime(new Date());
        return homeroundMapper.insertSelective(homeround);
    }

    @Override
    public int deleteHomeImages(int id) {
        return homeroundMapper.deleteByPrimaryKey(id);
    }
}
