package com.education.mapper;

import com.education.pojo.TZbCoursetype;
import com.education.pojo.TZbCoursetypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TZbCoursetypeMapper {
    int countByExample(TZbCoursetypeExample example);

    int deleteByExample(TZbCoursetypeExample example);

    int deleteByPrimaryKey(Integer zbId);

    int insert(TZbCoursetype record);

    int insertSelective(TZbCoursetype record);

    List<TZbCoursetype> selectByExample(TZbCoursetypeExample example);

    TZbCoursetype selectByPrimaryKey(Integer zbId);

    int updateByExampleSelective(@Param("record") TZbCoursetype record, @Param("example") TZbCoursetypeExample example);

    int updateByExample(@Param("record") TZbCoursetype record, @Param("example") TZbCoursetypeExample example);

    int updateByPrimaryKeySelective(TZbCoursetype record);

    int updateByPrimaryKey(TZbCoursetype record);
}