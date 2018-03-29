package com.xie.dao;

import com.xie.entity.TagEntity;
import com.xie.entity.TagEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagEntityMapper {
    long countByExample(TagEntityExample example);

    int deleteByExample(TagEntityExample example);

    int deleteByPrimaryKey(Integer tagId);

    int insert(TagEntity record);

    int insertSelective(TagEntity record);

    List<TagEntity> selectByExample(TagEntityExample example);

    TagEntity selectByPrimaryKey(Integer tagId);

    int updateByExampleSelective(@Param("record") TagEntity record, @Param("example") TagEntityExample example);

    int updateByExample(@Param("record") TagEntity record, @Param("example") TagEntityExample example);

    int updateByPrimaryKeySelective(TagEntity record);

    int updateByPrimaryKey(TagEntity record);
}