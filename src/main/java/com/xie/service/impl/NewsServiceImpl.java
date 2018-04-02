package com.xie.service.impl;

import com.xie.dao.NewsEntityMapper;
import com.xie.entity.NewsEntity;
import com.xie.entity.NewsEntityExample;
import com.xie.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 14:32
 */
@Service
public class NewsServiceImpl implements NewsService{
    @Autowired
    NewsEntityMapper newsEntityMapper;
    public int addNews(NewsEntity newsEntity) {
        newsEntity.setNewsCtime(new Date());
        newsEntity.setNewsMtime(new Date());
        return newsEntityMapper.insertSelective(newsEntity);
    }

    public int updateNews(NewsEntity newsEntity) {
        newsEntity.setNewsMtime(new Date());
        return newsEntityMapper.updateByPrimaryKeySelective(newsEntity);
    }

    public int deleteNews(Integer id) {
        return newsEntityMapper.deleteByPrimaryKey(id);
    }

    public List<NewsEntity> newsList(NewsEntityExample newsEntityExample) {
        return newsEntityMapper.selectByExample(newsEntityExample);
    }
}
