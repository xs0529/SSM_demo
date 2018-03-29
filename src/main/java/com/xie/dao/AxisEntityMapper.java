package com.xie.dao;

import com.xie.entity.AxisEntity;
import com.xie.entity.AxisEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AxisEntityMapper {
    long countByExample(AxisEntityExample example);

    int deleteByExample(AxisEntityExample example);

    int deleteByPrimaryKey(Integer timeAxisId);

    int insert(AxisEntity record);

    int insertSelective(AxisEntity record);

    List<AxisEntity> selectByExample(AxisEntityExample example);

    AxisEntity selectByPrimaryKey(Integer timeAxisId);

    int updateByExampleSelective(@Param("record") AxisEntity record, @Param("example") AxisEntityExample example);

    int updateByExample(@Param("record") AxisEntity record, @Param("example") AxisEntityExample example);

    int updateByPrimaryKeySelective(AxisEntity record);

    int updateByPrimaryKey(AxisEntity record);
}