package com.xie.dao;

import com.xie.entity.NewsEntity;
import com.xie.entity.NewsEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsEntityMapper {
    long countByExample(NewsEntityExample example);

    int deleteByExample(NewsEntityExample example);

    int deleteByPrimaryKey(Integer newsId);

    int insert(NewsEntity record);

    int insertSelective(NewsEntity record);

    List<NewsEntity> selectByExample(NewsEntityExample example);

    NewsEntity selectByPrimaryKey(Integer newsId);

    int updateByExampleSelective(@Param("record") NewsEntity record, @Param("example") NewsEntityExample example);

    int updateByExample(@Param("record") NewsEntity record, @Param("example") NewsEntityExample example);

    int updateByPrimaryKeySelective(NewsEntity record);

    int updateByPrimaryKey(NewsEntity record);
}