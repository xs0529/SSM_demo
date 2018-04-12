package com.xie.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.xie.service.UserService;
import com.xie.util.LayuiResult;
import com.xie.util.ResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping
    public String userLayuiList( //页码
                                  @RequestParam(value = "page",defaultValue = "1") Integer pageNumber,
                                  //记录数
                                  @RequestParam(value = "limit",defaultValue = "10") Integer count){
        PageInfo pageInfo = userService.userPageInfo(pageNumber,count);
        LayuiResult layuiResult = new LayuiResult();
        layuiResult.setSuccess();
        layuiResult.add("data",pageInfo.getList()).add("count",pageInfo.getTotal());
        return JSON.toJSON(layuiResult.getSet()).toString();
    }
    @PutMapping("/{id}")
    public ResultSet updataUserStatus(@PathVariable("id")long id, @RequestParam("status") String status){
        if (userService.updataUserStatus(id,status)>0){
            return ResultSet.success();
        }
        return ResultSet.fail();
    }
    @DeleteMapping("/{id}")
    public ResultSet deleteReply(@PathVariable("id")long id){
        if (userService.deleteUser(id)>0){
            return ResultSet.success();
        }
        return ResultSet.fail();
    }
}
