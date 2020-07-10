package com.education.service.impl;

import com.education.mapper.TZbDatabankMapper;
import com.education.pojo.TZbDatabank;
import com.education.pojo.TZbDatabankExample;
import com.education.service.DatabankService;
import com.education.util.PagePortal;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
        criteria.andZbDatabankNameLike("%"+que+"%");
        List<TZbDatabank> list=databankMapper.selectByExample(databankExample);
        PageInfo<TZbDatabank> pageInfo=new PageInfo<>(list);
        PagePortal pagePortal=new PagePortal();
        pagePortal.setTotal(pageInfo.getTotal());
        pagePortal.setRows(pageInfo.getList());
        pagePortal.setPageNow(page);
        pagePortal.setTypeName(que);
        pagePortal.setTotalPage(pageInfo.getTotal()%rows==0?(int)pageInfo.getTotal()/rows:(int)pageInfo.getTotal()/rows+1);
        return pagePortal;
    }

    @Override
    public int saveDatabank(TZbDatabank databank) {
        databank.setZbCreateTime(new Date());
        databank.setZbUpdateTime(new Date());
        return databankMapper.insertSelective(databank);
    }

    @Override
    public int updateDatabank(int id) {
        TZbDatabank databank=databankMapper.selectByPrimaryKey(id);
        if(databank.getZbDatabankAuthority()==1){
            databank.setZbDatabankAuthority(0);
        }else{
            databank.setZbDatabankAuthority(1);
        }
        return databankMapper.updateByPrimaryKeySelective(databank);
    }

    @Override
    public int deleteDatabank(int id) {
        return databankMapper.deleteByPrimaryKey(id);
    }
}
