package com.xie.controller;

import com.alibaba.fastjson.JSON;
import com.xie.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author 谢霜
 * @Description
 * @date 2018/3/27 17:06
 */
@Controller
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @RequestMapping(value="/{id}",method= RequestMethod.GET)
    @ResponseBody
    public String selectArticleById(@PathVariable("id") long id){
        return JSON.toJSON(articleService.selectById(id)).toString();
    }
}
