package com.xie.service.impl;

import com.xie.dao.ArticleEntityMapper;
import com.xie.entity.ArticleEntity;
import com.xie.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
