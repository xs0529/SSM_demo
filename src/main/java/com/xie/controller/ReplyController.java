package com.xie.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.xie.entity.*;
import com.xie.service.ReplyService;
import com.xie.service.UserService;
import com.xie.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 14:43
 */
@RestController
@RequestMapping("/blog/reply")
public class ReplyController {
    @Autowired
    ReplyService replyService;
    @Autowired
    UserService userService;
    @GetMapping
    public String replyLayuiList( //页码
                                  @RequestParam(value = "page",defaultValue = "1") Integer pageNumber,
                                  //记录数
                                  @RequestParam(value = "limit",defaultValue = "10") Integer count,@RequestParam(value = "status",defaultValue = "666")String status){
        PageInfo pageInfo = replyService.replyPageInfo(status,pageNumber,count);
        LayuiResult layuiResult = new LayuiResult();
        layuiResult.setSuccess();
        layuiResult.add("data",pageInfo.getList()).add("count",pageInfo.getTotal());
        return JSON.toJSON(layuiResult.getSet()).toString();
    }
    @PostMapping
    public ResultSet addReply(HttpServletRequest request,UserEntity userEntity, ReplyEntity replyEntity) throws UnsupportedEncodingException {
        UserEntity userEntity1 = userService.selectByEmail(userEntity.getUserEmail());
        if (userEntity1!=null){
            userEntity1.setUserName(userEntity.getUserName());
            userEntity1.setUserStatus(userEntity.getUserStatus());
            String ip = SystemUtil.getIpAddr(request);
            userEntity1.setUserIp(ip);
            userEntity1.setUserAddress(AddressUtils.getAddressCity("ip="+ip,"utf-8"));
            userService.updateUser(userEntity1);
            replyEntity.setReplyStatus("未通过");
            replyEntity.setUserId(userEntity1.getUserId());
            replyEntity.setUserName(userEntity1.getUserName());
            replyService.addReply(replyEntity);
            return ResultSet.success();
        }else {
            String ip = SystemUtil.getIpAddr(request);
            userEntity.setUserIp(ip);
            userEntity.setUserAddress(AddressUtils.getAddressCity("ip="+ip,"utf-8"));
            userService.addUser(userEntity);
            replyEntity.setReplyStatus("未通过");
            replyEntity.setUserId(userEntity.getUserId());
            replyEntity.setUserName(userEntity.getUserName());
            replyService.addReply(replyEntity);
            return ResultSet.success();
        }
    }
    @PutMapping("/{id}")
    public ResultSet updataReplyStatus(@PathVariable("id")long id,@RequestParam("status") String status){
        if (replyService.updateReplyStatus(id,status)>0){
            return ResultSet.success();
        }
        return ResultSet.fail();
    }
    @DeleteMapping("/{id}")
    public ResultSet deleteReply(@PathVariable("id")long id){
        if (replyService.deleteReply(id)>0){
            return ResultSet.success();
        }
        return ResultSet.fail();
    }
    @PostMapping("/admin")
    public ResultSet adminReply (ReplyEntity replyEntity) throws MessagingException {
        UserEntity userEntity =userService.selectById(replyEntity.getUserId());
        if (userEntity!=null){
            if (userEntity.getUserStatus().equals("ON")){
                SendMailUtil.sendMail(userEntity.getUserEmail(),"您好，您在白露博客的留言得到了回复，请查看",replyEntity.getReplyBody());
            }
        }
        replyEntity.setUserId(99999999L);
        replyEntity.setUserName("博主白露");
        replyEntity.setReplyStatus("通过");
        replyService.addReply(replyEntity);
        return  ResultSet.success();
    }
}
