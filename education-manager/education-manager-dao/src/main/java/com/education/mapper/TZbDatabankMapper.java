package com.education.mapper;

import com.education.pojo.TZbDatabank;
import com.education.pojo.TZbDatabankExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TZbDatabankMapper {
    int countByExample(TZbDatabankExample example);

    int deleteByExample(TZbDatabankExample example);

    int deleteByPrimaryKey(Integer zbId);

    int insert(TZbDatabank record);

    int insertSelective(TZbDatabank record);

    List<TZbDatabank> selectByExample(TZbDatabankExample example);

    TZbDatabank selectByPrimaryKey(Integer zbId);

    int updateByExampleSelective(@Param("record") TZbDatabank record, @Param("example") TZbDatabankExample example);

    int updateByExample(@Param("record") TZbDatabank record, @Param("example") TZbDatabankExample example);

    int updateByPrimaryKeySelective(TZbDatabank record);

    int updateByPrimaryKey(TZbDatabank record);
}