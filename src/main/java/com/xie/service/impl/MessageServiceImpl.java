package com.xie.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xie.dao.MessageEntityMapper;
import com.xie.dao.ReplyEntityMapper;
import com.xie.entity.*;
import com.xie.service.MessageService;
import com.xie.service.ReplyService;
import com.xie.service.UserService;
import com.xie.util.SendMailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
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
    @Autowired
    ReplyEntityMapper replyEntityMapper;
    @Autowired
    UserService userService;

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
        ReplyEntityExample replyEntityExample = new ReplyEntityExample();
        replyEntityExample.createCriteria().andMessageIdEqualTo(id);
        replyEntityMapper.deleteByExample(replyEntityExample);
        return messageEntityMapper.deleteByPrimaryKey(id);
    }

    public List<MessageEntity> messageList(MessageEntityExample messageEntityExample) {
        return messageEntityMapper.selectByExample1(messageEntityExample);
    }
    public List<MessageEntity> messageListLayui(MessageEntityExample messageEntityExample) {
        return messageEntityMapper.selectByExample(messageEntityExample);
    }

    public int updataMessageStatus(long id, String status) {
        MessageEntity messageEntity = messageEntityMapper.selectByPrimaryKey(id);
        UserEntity userEntity =userService.selectById(messageEntity.getUserId());
        if (userEntity!=null){
            if (userEntity.getUserStatus().equals("ON")&&status.equals("通过")){
                try {
                    SendMailUtil.sendMail(userEntity.getUserEmail(),"您好，您在白露个人博客的留言已通过审核","您的回复已通过审核，欢迎常来我的博客逛逛");
                } catch (MessagingException e) {
                    e.printStackTrace();
                }
            }
        }
        messageEntity.setMessageStatus(status);
        return messageEntityMapper.updateByPrimaryKey(messageEntity);
    }

    public PageInfo<MessageEntity> messagePageList(String status, Integer pageNumber, Integer count) {
        MessageEntityExample messageEntityExample;
        if (status.equals("666")){
            messageEntityExample = null;
        }else {
            messageEntityExample = new MessageEntityExample();
            messageEntityExample.createCriteria().andMessageStatusEqualTo(status);
        }
        PageHelper.startPage(pageNumber,count);
        List<MessageEntity> list = messageEntityMapper.selectByExample(messageEntityExample);
        PageInfo<MessageEntity> pageInfo = new PageInfo<MessageEntity>(list);
        return pageInfo;
    }
}
