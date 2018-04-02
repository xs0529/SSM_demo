package com.xie.service.impl;

import com.xie.dao.MessageEntityMapper;
import com.xie.entity.MessageEntity;
import com.xie.entity.MessageEntityExample;
import com.xie.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 13:44
 */
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageEntityMapper messageEntityMapper;

    public int addMessage(MessageEntity messageEntity) {
        messageEntity.setMessageCtime(new Date());
        messageEntity.setMessageMtime(new Date());
        return messageEntityMapper.insertSelective(messageEntity);
    }

    public int updateMessage(MessageEntity messageEntity) {
        messageEntity.setMessageMtime(new Date());
        return messageEntityMapper.updateByPrimaryKeySelective(messageEntity);
    }

    public int deleteMessage(long id) {
        return messageEntityMapper.deleteByPrimaryKey(id);
    }

    public List<MessageEntity> messageList(MessageEntityExample messageEntityExample) {
        return messageEntityMapper.selectByExample(messageEntityExample);
    }
}
