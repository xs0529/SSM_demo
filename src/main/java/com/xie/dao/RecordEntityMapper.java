package com.xie.dao;

import com.xie.entity.RecordEntity;
import com.xie.entity.RecordEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecordEntityMapper {
    long countByExample(RecordEntityExample example);

    int deleteByExample(RecordEntityExample example);

    int deleteByPrimaryKey(Long recordId);

    int insert(RecordEntity record);

    int insertSelective(RecordEntity record);

    List<RecordEntity> selectByExample(RecordEntityExample example);

    RecordEntity selectByPrimaryKey(Long recordId);

    int updateByExampleSelective(@Param("record") RecordEntity record, @Param("example") RecordEntityExample example);

    int updateByExample(@Param("record") RecordEntity record, @Param("example") RecordEntityExample example);

    int updateByPrimaryKeySelective(RecordEntity record);

    int updateByPrimaryKey(RecordEntity record);
}