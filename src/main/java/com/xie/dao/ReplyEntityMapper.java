package com.xie.dao;

import com.xie.entity.ReplyEntity;
import com.xie.entity.ReplyEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplyEntityMapper {
    long countByExample(ReplyEntityExample example);

    int deleteByExample(ReplyEntityExample example);

    int deleteByPrimaryKey(Long replyId);

    int insert(ReplyEntity record);

    int insertSelective(ReplyEntity record);

    List<ReplyEntity> selectByExample(ReplyEntityExample example);

    ReplyEntity selectByPrimaryKey(Long replyId);

    int updateByExampleSelective(@Param("record") ReplyEntity record, @Param("example") ReplyEntityExample example);

    int updateByExample(@Param("record") ReplyEntity record, @Param("example") ReplyEntityExample example);

    int updateByPrimaryKeySelective(ReplyEntity record);

    int updateByPrimaryKey(ReplyEntity record);
}