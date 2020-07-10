package com.education.mapper;

import com.education.pojo.TZbStudentUser;
import com.education.pojo.TZbStudentUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TZbStudentUserMapper {
    int countByExample(TZbStudentUserExample example);

    int deleteByExample(TZbStudentUserExample example);

    int deleteByPrimaryKey(Integer zbStudentId);

    int insert(TZbStudentUser record);

    int insertSelective(TZbStudentUser record);

    List<TZbStudentUser> selectByExample(TZbStudentUserExample example);

    TZbStudentUser selectByPrimaryKey(Integer zbStudentId);

    int updateByExampleSelective(@Param("record") TZbStudentUser record, @Param("example") TZbStudentUserExample example);

    int updateByExample(@Param("record") TZbStudentUser record, @Param("example") TZbStudentUserExample example);

    int updateByPrimaryKeySelective(TZbStudentUser record);

    int updateByPrimaryKey(TZbStudentUser record);
}