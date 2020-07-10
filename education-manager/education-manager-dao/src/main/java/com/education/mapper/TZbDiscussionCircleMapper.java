package com.education.mapper;

import com.education.pojo.TZbDiscussionCircle;
import com.education.pojo.TZbDiscussionCircleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TZbDiscussionCircleMapper {
    int countByExample(TZbDiscussionCircleExample example);

    int deleteByExample(TZbDiscussionCircleExample example);

    int deleteByPrimaryKey(Integer zbId);

    int insert(TZbDiscussionCircle record);

    int insertSelective(TZbDiscussionCircle record);

    List<TZbDiscussionCircle> selectByExample(TZbDiscussionCircleExample example);

    TZbDiscussionCircle selectByPrimaryKey(Integer zbId);

    int updateByExampleSelective(@Param("record") TZbDiscussionCircle record, @Param("example") TZbDiscussionCircleExample example);

    int updateByExample(@Param("record") TZbDiscussionCircle record, @Param("example") TZbDiscussionCircleExample example);

    int updateByPrimaryKeySelective(TZbDiscussionCircle record);

    int updateByPrimaryKey(TZbDiscussionCircle record);
}