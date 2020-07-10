package com.education.mapper;

import com.education.pojo.TZbDiscussion;
import com.education.pojo.TZbDiscussionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TZbDiscussionMapper {
    int countByExample(TZbDiscussionExample example);

    int deleteByExample(TZbDiscussionExample example);

    int deleteByPrimaryKey(Integer zbId);

    int insert(TZbDiscussion record);

    int insertSelective(TZbDiscussion record);

    List<TZbDiscussion> selectByExample(TZbDiscussionExample example);

    TZbDiscussion selectByPrimaryKey(Integer zbId);

    int updateByExampleSelective(@Param("record") TZbDiscussion record, @Param("example") TZbDiscussionExample example);

    int updateByExample(@Param("record") TZbDiscussion record, @Param("example") TZbDiscussionExample example);

    int updateByPrimaryKeySelective(TZbDiscussion record);

    int updateByPrimaryKey(TZbDiscussion record);
}