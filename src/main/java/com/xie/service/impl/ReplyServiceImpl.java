package com.xie.service.impl;

import com.xie.dao.ReplyEntityMapper;
import com.xie.entity.ReplyEntity;
import com.xie.entity.ReplyEntityExample;
import com.xie.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
