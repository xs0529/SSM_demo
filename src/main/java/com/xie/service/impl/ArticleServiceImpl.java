package com.xie.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.jdbc.StringUtils;
import com.xie.dao.ArticleEntityMapper;
import com.xie.entity.ArticleEntity;
import com.xie.entity.ArticleEntityExample;
import com.xie.entity.ClassEntity;
import com.xie.entity.TagEntity;
import com.xie.service.ArticleService;
import com.xie.service.ClassService;
import com.xie.service.TagService;
import com.xie.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    @Autowired
    TagService tagService;
    @Autowired
    ClassService classService;

    public ArticleEntity selectById(long id) {
        return articleEntityMapper.selectByPrimaryKey(id);
    }

    public PageInfo<ArticleEntity> articleList(Integer pageNumber, Integer count, Integer classification, Integer reading, String tag) {
        ArticleEntityExample articleEntityExample = new ArticleEntityExample();
        ArticleEntityExample.Criteria criteria = articleEntityExample.createCriteria();
        if (classification != 999){
            criteria.andClassificationIdEqualTo(classification);
        }
        if (reading != 0){
            articleEntityExample.setOrderByClause("article_reading desc");
        }
        if (!tag.equals("0")){
            //Mybatis自动生成的查询selectByExample(TExample example) 中like需要自己写通配符
            tag = "%"+tag+"%";
            criteria.andArticleTagLike(tag);
        }
        PageHelper.startPage(pageNumber,count);
        List<ArticleEntity> list = articleEntityMapper.selectByExampleWithBLOBs(articleEntityExample);
        PageInfo<ArticleEntity> pageInfo = new PageInfo<ArticleEntity>(list);
        return pageInfo;
    }


    public int addArticle(ArticleEntity articleEntity) {
            articleEntity.setArticleCtime(new Date());
            articleEntity.setArticleMtime(new Date());
            String text = StringUtil.delHTMLTag(articleEntity.getArticleText());
            articleEntity.setArticleText(text.substring(0,90));
            String tags[] = articleEntity.getArticleTag().split(",");
            for (String tag:tags){
                if (tagService.selectTagByName(tag)<1){
                    TagEntity tagEntity = new TagEntity();
                    tagEntity.setTagName(tag);
                    tagService.addTag(tagEntity);
                }
            }
            ClassEntity classEntity = classService.getClass(articleEntity.getClassificationId());
            if (classEntity != null){
                articleEntity.setClassificationName(classEntity.getClassificationName());
            }
        return articleEntityMapper.insertSelective(articleEntity);
    }

    public int updateArticle(ArticleEntity articleEntity) {
        return articleEntityMapper.updateByPrimaryKey(articleEntity);
    }
}
