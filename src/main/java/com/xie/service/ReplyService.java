package com.xie.service;

import com.github.pagehelper.PageInfo;
import com.xie.entity.ReplyEntity;
import com.xie.entity.ReplyEntityExample;

import java.util.List;
/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 13:48
 */
public interface ReplyService {
    int addReply(ReplyEntity replyEntity);
    int updateReply(ReplyEntity replyEntity);
    int deleteReply(long id);
    List<ReplyEntity> replyList(ReplyEntityExample replyEntityExample);
    int updateReplyStatus(long id,String status);
    PageInfo<ReplyEntity> replyPageInfo(String status,Integer pageNumber, Integer count);
}
