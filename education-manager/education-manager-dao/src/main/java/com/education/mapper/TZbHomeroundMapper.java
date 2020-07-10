package com.education.mapper;

import com.education.pojo.TZbHomeround;
import com.education.pojo.TZbHomeroundExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TZbHomeroundMapper {
    int countByExample(TZbHomeroundExample example);

    int deleteByExample(TZbHomeroundExample example);

    int deleteByPrimaryKey(Integer zbId);

    int insert(TZbHomeround record);

    int insertSelective(TZbHomeround record);

    List<TZbHomeround> selectByExample(TZbHomeroundExample example);

    TZbHomeround selectByPrimaryKey(Integer zbId);

    int updateByExampleSelective(@Param("record") TZbHomeround record, @Param("example") TZbHomeroundExample example);

    int updateByExample(@Param("record") TZbHomeround record, @Param("example") TZbHomeroundExample example);

    int updateByPrimaryKeySelective(TZbHomeround record);

    int updateByPrimaryKey(TZbHomeround record);
}