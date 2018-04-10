package com.xie.controller;

import com.xie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 14:45
 */
@RestController
@RequestMapping("/blog/user")
public class UserController {
    @Autowired
    UserService userService;
}
