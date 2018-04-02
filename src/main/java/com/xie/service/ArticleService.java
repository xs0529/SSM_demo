package com.xie.service;

import com.github.pagehelper.PageInfo;
import com.xie.entity.ArticleEntity;

/**
 * @author 谢霜
 * @Description
 * @date 2018/3/27 17:08
 */
public interface ArticleService {
    /*
     * @author 谢霜
     * @Description 根据ID查询博文
     * @params  * @param id
     * @return com.xie.entity.ArticleEntity
     * @date 2018/3/29 14:20
     */
    ArticleEntity selectById(long id);
  /*
   * @author 谢霜
   * @Description 分页查询博文
   * @params  * @param pageNumber 页码
   * @param count 记录数
   * @param classification 分类
   * @param reading 阅读量
   * @param tag 标签
   * @return com.github.pagehelper.PageInfo<com.xie.entity.ArticleEntity>
   * @date 2018/3/29 14:58
   */
    PageInfo<ArticleEntity> articleList(Integer pageNumber, Integer count, Integer classification,
                                        Integer reading, String tag);
    /*
     * @author 谢霜
     * @Description 新增博文
     * @params  * @param articleEntity
     * @return int
     * @date 2018/3/29 14:21
     */
    int addArticle(ArticleEntity articleEntity);
    /*
     * @author 谢霜
     * @Description 修改博文
     * @params  * @param id
     * @param articleEntity
     * @return int
     * @date 2018/4/2 11:28
     */
    int updateArticle(ArticleEntity articleEntity);
}
