package com.xie.service;

import com.github.pagehelper.PageInfo;
import com.xie.entity.MessageEntity;
import com.xie.entity.MessageEntityExample;

import java.util.List;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 13:40
 */
public interface MessageService {
    int addMessage(MessageEntity messageEntity);
    int updateMessage(MessageEntity messageEntity);
    int deleteMessage(long id);
    List<MessageEntity> messageList(MessageEntityExample messageEntityExample);
    List<MessageEntity> messageListLayui(MessageEntityExample messageEntityExample);
    int updataMessageStatus(long id,String status);
     PageInfo<MessageEntity> messagePageList (String status,Integer pageNumber, Integer count);
}
