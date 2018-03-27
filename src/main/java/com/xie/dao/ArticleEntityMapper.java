package com.xie.dao;

import com.xie.entity.ArticleEntity;
import com.xie.entity.ArticleEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleEntityMapper {
    long countByExample(ArticleEntityExample example);

    int deleteByExample(ArticleEntityExample example);

    int deleteByPrimaryKey(Long articleId);

    int insert(ArticleEntity record);

    int insertSelective(ArticleEntity record);

    List<ArticleEntity> selectByExampleWithBLOBs(ArticleEntityExample example);

    List<ArticleEntity> selectByExample(ArticleEntityExample example);

    ArticleEntity selectByPrimaryKey(Long articleId);

    int updateByExampleSelective(@Param("record") ArticleEntity record, @Param("example") ArticleEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") ArticleEntity record, @Param("example") ArticleEntityExample example);

    int updateByExample(@Param("record") ArticleEntity record, @Param("example") ArticleEntityExample example);

    int updateByPrimaryKeySelective(ArticleEntity record);

    int updateByPrimaryKeyWithBLOBs(ArticleEntity record);

    int updateByPrimaryKey(ArticleEntity record);
}