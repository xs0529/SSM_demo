package com.xie.dao;

import com.xie.entity.ClassEntity;
import com.xie.entity.ClassEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassEntityMapper {
    long countByExample(ClassEntityExample example);

    int deleteByExample(ClassEntityExample example);

    int deleteByPrimaryKey(Integer classificationId);

    int insert(ClassEntity record);

    int insertSelective(ClassEntity record);

    List<ClassEntity> selectByExample(ClassEntityExample example);

    ClassEntity selectByPrimaryKey(Integer classificationId);

    int updateByExampleSelective(@Param("record") ClassEntity record, @Param("example") ClassEntityExample example);

    int updateByExample(@Param("record") ClassEntity record, @Param("example") ClassEntityExample example);

    int updateByPrimaryKeySelective(ClassEntity record);

    int updateByPrimaryKey(ClassEntity record);
}