package com.education.mapper;

import com.education.pojo.TZbCourse;
import com.education.pojo.TZbCourseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TZbCourseMapper {
    int countByExample(TZbCourseExample example);

    int deleteByExample(TZbCourseExample example);

    int deleteByPrimaryKey(Integer zbId);

    int insert(TZbCourse record);

    int insertSelective(TZbCourse record);

    List<TZbCourse> selectByExampleWithBLOBs(TZbCourseExample example);

    List<TZbCourse> selectByExample(TZbCourseExample example);

    TZbCourse selectByPrimaryKey(Integer zbId);

    int updateByExampleSelective(@Param("record") TZbCourse record, @Param("example") TZbCourseExample example);

    int updateByExampleWithBLOBs(@Param("record") TZbCourse record, @Param("example") TZbCourseExample example);

    int updateByExample(@Param("record") TZbCourse record, @Param("example") TZbCourseExample example);

    int updateByPrimaryKeySelective(TZbCourse record);

    int updateByPrimaryKeyWithBLOBs(TZbCourse record);

    int updateByPrimaryKey(TZbCourse record);
}