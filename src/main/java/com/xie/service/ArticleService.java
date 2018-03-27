package com.xie.service;

import com.xie.entity.ArticleEntity;

/**
 * @author 谢霜
 * @Description
 * @date 2018/3/27 17:08
 */
public interface ArticleService {
    ArticleEntity selectById(long id);
}
