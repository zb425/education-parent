package com.education.mapper;

import com.education.pojo.TZbCourseSection;
import com.education.pojo.TZbCourseSectionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TZbCourseSectionMapper {
    int countByExample(TZbCourseSectionExample example);

    int deleteByExample(TZbCourseSectionExample example);

    int deleteByPrimaryKey(Integer zbId);

    int insert(TZbCourseSection record);

    int insertSelective(TZbCourseSection record);

    List<TZbCourseSection> selectByExample(TZbCourseSectionExample example);

    TZbCourseSection selectByPrimaryKey(Integer zbId);

    int updateByExampleSelective(@Param("record") TZbCourseSection record, @Param("example") TZbCourseSectionExample example);

    int updateByExample(@Param("record") TZbCourseSection record, @Param("example") TZbCourseSectionExample example);

    int updateByPrimaryKeySelective(TZbCourseSection record);

    int updateByPrimaryKey(TZbCourseSection record);
}