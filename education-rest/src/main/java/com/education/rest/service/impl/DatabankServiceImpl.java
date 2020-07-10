package com.education.rest.service.impl;

import com.education.mapper.TZbDatabankMapper;
import com.education.pojo.TZbDatabank;
import com.education.pojo.TZbDatabankExample;
import com.education.rest.service.DatabankService;
import com.education.util.PagePortal;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatabankServiceImpl implements DatabankService {
    @Autowired
    private TZbDatabankMapper databankMapper;

    @Override
    public PagePortal getDatabankList(String que, int page, int rows) {
        PageHelper.startPage(page,rows);
        TZbDatabankExample databankExample=new TZbDatabankExample();
        TZbDatabankExample.Criteria criteria=databankExample.createCriteria();
        if(que.equals("all")){
            criteria.andZbDatabankAuthorityEqualTo(1);
        }
        if(que.equals("new")){
            criteria.andZbDatabankAuthorityEqualTo(1);
            databankExample.setOrderByClause("zb_create_time DESC");
        }
        if(que.equals("cou")){
            criteria.andZbDatabankAuthorityEqualTo(1);
            databankExample.setOrderByClause("zb_databank_count DESC");
        }
        List<TZbDatabank> list=databankMapper.selectByExample(databankExample);
        PageInfo<TZbDatabank> pageInfo=new PageInfo<>(list);
        PagePortal pagePortal=new PagePortal();
        pagePortal.setPageNow(page);
        pagePortal.setTotal(pageInfo.getTotal());
        pagePortal.setRows(pageInfo.getList());
        pagePortal.setTypeName(que);
        pagePortal.setTotalPage(pageInfo.getTotal()%rows==0?(int)pageInfo.getTotal()/rows:(int)pageInfo.getTotal()/rows+1);
        return pagePortal;
    }

    @Override
    public int updateDatabank(int id) {
        TZbDatabank databank=databankMapper.selectByPrimaryKey(id);
        databank.setZbDatabankCount(databank.getZbDatabankCount()+1);

        return databankMapper.updateByPrimaryKeySelective(databank);
    }

    @Override
    public List<TZbDatabank> getDatabankTopList(String top, int page, int rows) {
        PageHelper.startPage(page,rows);
        TZbDatabankExample databankExample=new TZbDatabankExample();
        TZbDatabankExample.Criteria criteria=databankExample.createCriteria();
        criteria.andZbDatabankAuthorityEqualTo(1);
        if(top.equals("time")){
            databankExample.setOrderByClause("zb_create_time DESC");
        }else{
            databankExample.setOrderByClause("zb_databank_count DESC");
        }
        List<TZbDatabank> list=databankMapper.selectByExample(databankExample);
        return list;
    }
}
