package com.xie.controller;

import com.xie.entity.AdminEntity;
import com.xie.service.BlogerService;
import com.xie.util.ResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 14:45
 */
@RestController
@RequestMapping("/blog/bloger")
public class BlogerController {
    @Autowired
    BlogerService blogerService;

    @PostMapping
    public ResultSet updateBloger(AdminEntity adminEntity){
        if (blogerService.updateBloger(adminEntity)>0){
            return ResultSet.success();
        }
        return ResultSet.fail();
    }

    @GetMapping
    public ResultSet getBloger(){
        return ResultSet.success().add("bloger",blogerService.getAdmin(1));
    }
}
