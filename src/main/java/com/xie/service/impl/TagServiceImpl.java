package com.xie.service.impl;

import com.xie.dao.TagEntityMapper;
import com.xie.entity.TagEntity;
import com.xie.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 13:58
 */
@Service
public class TagServiceImpl implements TagService{
    @Autowired
    TagEntityMapper tagEntityMapper;

    public int addTag(TagEntity tagEntity) {
        tagEntity.setTagCtime(new Date());
        tagEntity.setTagMtime(new Date());
        return tagEntityMapper.insertSelective(tagEntity);
    }

    public int updateTag(TagEntity tagEntity) {
        tagEntity.setTagMtime(new Date());
        return tagEntityMapper.updateByPrimaryKeySelective(tagEntity);
    }

    public int deleteTag(Integer id) {
        return tagEntityMapper.deleteByPrimaryKey(id);
    }

    public List<TagEntity> tagList() {
        return tagEntityMapper.selectByExample(null);
    }
}
