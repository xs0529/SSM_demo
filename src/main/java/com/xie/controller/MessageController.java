package com.xie.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.xie.entity.MessageEntity;
import com.xie.entity.MessageEntityExample;
import com.xie.entity.UserEntity;
import com.xie.service.MessageService;
import com.xie.service.UserService;
import com.xie.util.AddressUtils;
import com.xie.util.LayuiResult;
import com.xie.util.ResultSet;
import com.xie.util.SystemUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 14:42
 */
@RestController
@RequestMapping("/blog/message")
public class MessageController {
    @Autowired
    MessageService messageService;
    @Autowired
    UserService userService;
    @GetMapping("/article/{id}")
    public ResultSet messageList(@PathVariable("id")long id){
        MessageEntityExample messageEntityExample = new MessageEntityExample();
        messageEntityExample.setOrderByClause("message.message_ctime");
        messageEntityExample.createCriteria().andArticleIdEqualTo(id).andMessageStatusEqualTo("通过");
        return ResultSet.success().add("messageList",messageService.messageList(messageEntityExample));
    }
    @GetMapping
    public String messageLayuiList( //页码
                                    @RequestParam(value = "page",defaultValue = "1") Integer pageNumber,
                                    //记录数
                                    @RequestParam(value = "limit",defaultValue = "10") Integer count,@RequestParam(value = "status",defaultValue = "666")String status){
        PageInfo pageInfo = messageService.messagePageList(status,pageNumber,count);
        LayuiResult layuiResult = new LayuiResult();
        layuiResult.setSuccess();
        layuiResult.add("data",pageInfo.getList()).add("count",pageInfo.getTotal());
        return JSON.toJSON(layuiResult.getSet()).toString();
    }
    @PostMapping
    public ResultSet addMessage(HttpServletRequest request,UserEntity userEntity, MessageEntity messageEntity) throws UnsupportedEncodingException {
         UserEntity userEntity1 = userService.selectByEmail(userEntity.getUserEmail());
        if (userEntity1!=null){
            userEntity1.setUserName(userEntity.getUserName());
            userEntity1.setUserStatus(userEntity.getUserStatus());
            String ip = SystemUtil.getIpAddr(request);
            userEntity1.setUserIp(ip);
            userEntity1.setUserAddress(AddressUtils.getAddressCity("ip="+ip,"utf-8"));
            userService.updateUser(userEntity1);
            messageEntity.setMessageStatus("未通过");
            messageEntity.setUserId(userEntity1.getUserId());
            messageEntity.setUserName(userEntity.getUserName());
            messageService.addMessage(messageEntity);
            return ResultSet.success();
        }else {
            String ip = SystemUtil.getIpAddr(request);
            userEntity.setUserIp(ip);
            userEntity.setUserAddress(AddressUtils.getAddressCity("ip="+ip,"utf-8"));
            userService.addUser(userEntity);
            messageEntity.setMessageStatus("未通过");
            messageEntity.setUserId(userEntity.getUserId());
            messageEntity.setUserName(userEntity.getUserName());
            messageService.addMessage(messageEntity);
            return ResultSet.success();
        }
    }
    @PutMapping("/{id}")
    public ResultSet updataMessageStatus(@PathVariable("id")long id,@RequestParam("status") String status){
        if (messageService.updataMessageStatus(id,status)>0){
            return ResultSet.success();
        }
        return ResultSet.fail();
    }
    @DeleteMapping("/{id}")
    public ResultSet deleteMessage(@PathVariable("id")long id){
        if (messageService.deleteMessage(id)>0){
            return ResultSet.success();
        }
        return ResultSet.fail();
    }
}
