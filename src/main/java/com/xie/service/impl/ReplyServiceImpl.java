package com.xie.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xie.dao.ReplyEntityMapper;
import com.xie.entity.*;
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
 * @date 2018/4/2 13:52
 */
@Service
public class ReplyServiceImpl implements ReplyService {
    @Autowired
    ReplyEntityMapper replyEntityMapper;
    @Autowired
    UserService userService;

    public int addReply(ReplyEntity replyEntity) {
        replyEntity.setReplyCtime(new Date());
        replyEntity.setReplyMtime(new Date());
        return replyEntityMapper.insertSelective(replyEntity);
    }

    public int updateReply(ReplyEntity replyEntity) {
        replyEntity.setReplyMtime(new Date());
        return replyEntityMapper.updateByPrimaryKeySelective(replyEntity);
    }

    public int deleteReply(long id) {
        return replyEntityMapper.deleteByPrimaryKey(id);
    }

    public List<ReplyEntity> replyList(ReplyEntityExample replyEntityExample) {
        return replyEntityMapper.selectByExample(replyEntityExample);
    }

    public int updateReplyStatus(long id, String status) {
        ReplyEntity replyEntity = replyEntityMapper.selectByPrimaryKey(id);
        UserEntity userEntity =userService.selectById(replyEntity.getUserId());
        if (userEntity!=null){
            if (userEntity.getUserStatus().equals("ON")&&status.equals("通过")){
                try {
                    SendMailUtil.sendMail(userEntity.getUserEmail(),"您好，您在白露个人博客的留言已通过审核","您的回复已通过审核，欢迎常来我的博客逛逛");
                } catch (MessagingException e) {
                    e.printStackTrace();
                }
            }
        }
        replyEntity.setReplyStatus(status);
        return replyEntityMapper.updateByPrimaryKey(replyEntity);
    }

    public PageInfo<ReplyEntity> replyPageInfo(String status, Integer pageNumber, Integer count) {
        ReplyEntityExample replyEntityExample;
        if (status.equals("666")){
            replyEntityExample = null;
        }else {
            replyEntityExample = new ReplyEntityExample();
            replyEntityExample.createCriteria().andReplyStatusEqualTo(status);
        }
        PageHelper.startPage(pageNumber,count);
        List<ReplyEntity> list = replyEntityMapper.selectByExample(replyEntityExample);
        PageInfo<ReplyEntity> pageInfo = new PageInfo<ReplyEntity>(list);
        return pageInfo;
    }
}
