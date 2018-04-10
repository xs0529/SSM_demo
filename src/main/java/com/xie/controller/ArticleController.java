package com.xie.controller;

import com.github.pagehelper.PageInfo;
import com.xie.entity.ArticleEntity;
import com.xie.service.ArticleService;
import com.xie.service.NewsService;
import com.xie.util.ResultSet;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    NewsService newsService;
    /*
     * @author 谢霜
     * @Description 分页查新博文
     * @params  * @param pageNumber 页码
     * @param count 记录数
     * @param classification 是否按照分类查询
     * @param reading 阅读量
     * @param tag 标签
     * @return com.xie.util.ResultSet
     * @date 2018/3/30 13:54
     */
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
        return ResultSet.success().add("pageInfo",pageInfo).add("news",newsService.newsList(null).get(0));
    }
    /*
     * @author 谢霜
     * @Description 查询博文
     * @params  * @param articleId
     * @return com.xie.util.ResultSet
     * @date 2018/3/30 14:06
     */
    @GetMapping("/{id}")
    public ResultSet selectArticleById(@PathVariable("id")Long articleId){
        return ResultSet.success().add("article",articleService.selectById(articleId)).add("news",newsService.newsList(null).get(0));
    }
    /*
     * @author 谢霜
     * @Description 新增博文
     * @params  * @param articleEntity
     * @return com.xie.util.ResultSet
     * @date 2018/3/30 14:06
     */
    @PostMapping
    public ResultSet insertArticle(ArticleEntity articleEntity){
        if (articleService.addArticle(articleEntity)>0){
            return ResultSet.success();
        } else {
            return ResultSet.fail();
        }
    }
    /*
     * @author 谢霜
     * @    Description 修改博文
     * @params  * @param articleEntity
     * @return com.xie.util.ResultSet
     * @date 2018/4/2 11:31
     */
    @PutMapping
    public ResultSet updateArticle(ArticleEntity articleEntity){
        if (articleService.updateArticle(articleEntity)>0){
            return ResultSet.success();
        } else {
            return ResultSet.fail();
        }
    }
}
