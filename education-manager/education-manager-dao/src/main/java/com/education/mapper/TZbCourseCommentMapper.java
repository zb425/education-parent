package com.education.mapper;

import com.education.pojo.TZbCourseComment;
import com.education.pojo.TZbCourseCommentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TZbCourseCommentMapper {
    int countByExample(TZbCourseCommentExample example);

    int deleteByExample(TZbCourseCommentExample example);

    int deleteByPrimaryKey(Integer zbId);

    int insert(TZbCourseComment record);

    int insertSelective(TZbCourseComment record);

    List<TZbCourseComment> selectByExample(TZbCourseCommentExample example);

    TZbCourseComment selectByPrimaryKey(Integer zbId);

    int updateByExampleSelective(@Param("record") TZbCourseComment record, @Param("example") TZbCourseCommentExample example);

    int updateByExample(@Param("record") TZbCourseComment record, @Param("example") TZbCourseCommentExample example);

    int updateByPrimaryKeySelective(TZbCourseComment record);

    int updateByPrimaryKey(TZbCourseComment record);
}