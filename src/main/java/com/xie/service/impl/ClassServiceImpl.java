package com.xie.service.impl;

import com.xie.dao.ArticleEntityMapper;
import com.xie.dao.ClassEntityMapper;
import com.xie.entity.ArticleEntity;
import com.xie.entity.ArticleEntityExample;
import com.xie.entity.ClassEntity;
import com.xie.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 11:36
 */
@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    ClassEntityMapper classEntityMapper;
    @Autowired
    ArticleEntityMapper articleEntityMapper;

    public int addClass(ClassEntity classEntity) {
        return classEntityMapper.insertSelective(classEntity);
    }

    public int updateClass(ClassEntity classEntity) {
        ArticleEntityExample articleEntityExample = new ArticleEntityExample();
        articleEntityExample.or().andClassificationIdEqualTo(classEntity.getClassificationId());
        List<ArticleEntity> articleList = articleEntityMapper.selectByExample(articleEntityExample);
        /*
        * 修改博文表的分类名
        */
        for (ArticleEntity articleEntity: articleList){
            articleEntity.setClassificationName(classEntity.getClassificationName());
            articleEntityMapper.updateByPrimaryKey(articleEntity);
        }
        return classEntityMapper.updateByPrimaryKeySelective(classEntity);
    }

    public int deleteClass(Integer id) {
        ArticleEntityExample articleEntityExample = new ArticleEntityExample();
        articleEntityExample.createCriteria().andClassificationIdEqualTo(id);
        /*
        * 删除对应分类的博文
        */
        if (articleEntityMapper.deleteByExample(articleEntityExample)>0){
            if (classEntityMapper.deleteByPrimaryKey(id)>0){
                return 1;
            }
        }
        return 0;
    }

    public List<ClassEntity> ClassList() {
        return classEntityMapper.selectByExample(null);
    }

    public ClassEntity getClass(Integer id) {
        return classEntityMapper.selectByPrimaryKey(id);
    }
}
