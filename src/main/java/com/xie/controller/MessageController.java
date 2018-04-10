package com.xie.controller;

import com.xie.entity.MessageEntity;
import com.xie.entity.MessageEntityExample;
import com.xie.entity.UserEntity;
import com.xie.service.MessageService;
import com.xie.service.UserService;
import com.xie.util.AddressUtils;
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
        messageEntityExample.createCriteria().andArticleIdEqualTo(id).andMessageStatusEqualTo("ON");
        return ResultSet.success().add("messageList",messageService.messageList(messageEntityExample));
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
            messageEntity.setMessageStatus("OFF");
            messageEntity.setUserId(userEntity1.getUserId());
            messageEntity.setUserName(userEntity.getUserName());
            messageService.addMessage(messageEntity);
            return ResultSet.success();
        }else {
            String ip = SystemUtil.getIpAddr(request);
            userEntity.setUserIp(ip);
            userEntity.setUserAddress(AddressUtils.getAddressCity("ip="+ip,"utf-8"));
            userService.addUser(userEntity);
            messageEntity.setMessageStatus("OFF");
            messageEntity.setUserId(userEntity.getUserId());
            messageEntity.setUserName(userEntity.getUserName());
            messageService.addMessage(messageEntity);
            return ResultSet.success();
        }
    }
}
