package com.xie.dao;

import com.xie.entity.MessageEntity;
import com.xie.entity.MessageEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageEntityMapper {
    long countByExample(MessageEntityExample example);

    int deleteByExample(MessageEntityExample example);

    int deleteByPrimaryKey(Long messageId);

    int insert(MessageEntity record);

    int insertSelective(MessageEntity record);

    List<MessageEntity> selectByExample(MessageEntityExample example);

    MessageEntity selectByPrimaryKey(Long messageId);

    int updateByExampleSelective(@Param("record") MessageEntity record, @Param("example") MessageEntityExample example);

    int updateByExample(@Param("record") MessageEntity record, @Param("example") MessageEntityExample example);

    int updateByPrimaryKeySelective(MessageEntity record);

    int updateByPrimaryKey(MessageEntity record);
}