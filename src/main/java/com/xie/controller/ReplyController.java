package com.xie.controller;

import com.xie.entity.MessageEntity;
import com.xie.entity.ReplyEntity;
import com.xie.entity.UserEntity;
import com.xie.service.ReplyService;
import com.xie.service.UserService;
import com.xie.util.AddressUtils;
import com.xie.util.ResultSet;
import com.xie.util.SystemUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
            replyEntity.setReplyStatus("OFF");
            replyEntity.setUserId(userEntity1.getUserId());
            replyEntity.setUserName(userEntity1.getUserName());
            replyService.addReply(replyEntity);
            return ResultSet.success();
        }else {
            String ip = SystemUtil.getIpAddr(request);
            userEntity.setUserIp(ip);
            userEntity.setUserAddress(AddressUtils.getAddressCity("ip="+ip,"utf-8"));
            userService.addUser(userEntity);
            replyEntity.setReplyStatus("OFF");
            replyEntity.setUserId(userEntity.getUserId());
            replyEntity.setUserName(userEntity.getUserName());
            replyService.addReply(replyEntity);
            return ResultSet.success();
        }
    }
}
