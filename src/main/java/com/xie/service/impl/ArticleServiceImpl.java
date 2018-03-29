package com.xie.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xie.dao.ArticleEntityMapper;
import com.xie.entity.ArticleEntity;
import com.xie.entity.ArticleEntityExample;
import com.xie.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 谢霜
 * @Description
 * @date 2018/3/27 17:10
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleEntityMapper articleEntityMapper;

    public ArticleEntity selectById(long id) {
        return articleEntityMapper.selectByPrimaryKey(id);
    }

    public PageInfo<ArticleEntity> articleList(Integer pageNumber, Integer count, Integer classification, Integer reading, String tag) {
        ArticleEntityExample articleEntityExample = new ArticleEntityExample();
        if (classification != 999){
            articleEntityExample.createCriteria().andClassificationIdEqualTo(classification);
        }
        if (reading != 0){
            articleEntityExample.setOrderByClause("article_reading desc");
        }
        if (tag != "0"){
            articleEntityExample.createCriteria().andArticleTagLike(tag);
        }
        PageHelper.startPage(pageNumber,count);
        List<ArticleEntity> list = articleEntityMapper.selectByExampleWithBLOBs(articleEntityExample);
        PageInfo<ArticleEntity> pageInfo = new PageInfo<ArticleEntity>(list);
        return pageInfo;
    }


    public int addArticle(ArticleEntity articleEntity) {
        return articleEntityMapper.insertSelective(articleEntity);
    }
}
