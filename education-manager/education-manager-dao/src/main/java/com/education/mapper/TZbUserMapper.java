package com.education.mapper;

import com.education.pojo.TZbUser;
import com.education.pojo.TZbUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TZbUserMapper {
    int countByExample(TZbUserExample example);

    int deleteByExample(TZbUserExample example);

    int deleteByPrimaryKey(Integer zbId);

    int insert(TZbUser record);

    int insertSelective(TZbUser record);

    List<TZbUser> selectByExample(TZbUserExample example);

    TZbUser selectByPrimaryKey(Integer zbId);

    int updateByExampleSelective(@Param("record") TZbUser record, @Param("example") TZbUserExample example);

    int updateByExample(@Param("record") TZbUser record, @Param("example") TZbUserExample example);

    int updateByPrimaryKeySelective(TZbUser record);

    int updateByPrimaryKey(TZbUser record);
}