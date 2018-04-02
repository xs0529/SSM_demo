package com.xie.service;

import com.xie.entity.NewsEntity;
import com.xie.entity.NewsEntityExample;

import java.util.List;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 14:30
 */
public interface NewsService {
    int addNews(NewsEntity newsEntity);
    int updateNews(NewsEntity newsEntity);
    int deleteNews(Integer id);
    List<NewsEntity> newsList(NewsEntityExample newsEntityExample);
}
