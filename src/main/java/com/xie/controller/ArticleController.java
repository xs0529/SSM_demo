package com.xie.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.xie.service.ArticleService;
import com.xie.util.ResultSet;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author 谢霜
 * @Description 博文控制器
 * @date 2018/3/27 17:06
 */
@RestController
@RequestMapping("/blog/article")
public class ArticleController {
    @Autowired
    ArticleService articleService;
    @GetMapping
    public ResultSet allArticle(
            //页码
            @RequestParam(value = "pageNumber",defaultValue = "1") Integer pageNumber,
            //记录数
            @RequestParam(value = "count",defaultValue = "10") Integer count,
            //是否按照分类查询，默认999不按照分类查询
            @RequestParam(value = "classification",defaultValue = "999")Integer classification,
            //是否按照阅读量排序查询，默认0不按照阅读量排序查询
            @RequestParam(value = "reading",defaultValue = "0")Integer reading,
            //是否根据标签查询，默认0不根据标签查询
            @RequestParam(value = "tag",defaultValue = "0")String tag) {
        PageInfo pageInfo = articleService.articleList(pageNumber,count,classification,reading,tag);
        return ResultSet.success().add("pageInfo",pageInfo);
    }

}
