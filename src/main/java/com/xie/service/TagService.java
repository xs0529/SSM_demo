package com.xie.service;

import com.xie.entity.TagEntity;

import java.util.List;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 13:55
 */
public interface TagService {
    int addTag(TagEntity tagEntity);
    int updateTag(TagEntity tagEntity);
    int deleteTag(Integer id);
    List<TagEntity> tagList();
}
