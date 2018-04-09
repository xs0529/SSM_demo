package com.xie.controller;

import com.xie.entity.MessageEntityExample;
import com.xie.service.MessageService;
import com.xie.util.ResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("/article/{id}")
    public ResultSet messageList(@PathVariable("id")long id){
        MessageEntityExample messageEntityExample = new MessageEntityExample();
        messageEntityExample.createCriteria().andArticleIdEqualTo(id);
        return ResultSet.success().add("messageList",messageService.messageList(messageEntityExample));
    }
}
