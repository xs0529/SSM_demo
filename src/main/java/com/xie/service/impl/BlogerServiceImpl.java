package com.xie.service.impl;

import com.xie.dao.AdminEntityMapper;
import com.xie.entity.AdminEntity;
import com.xie.service.BlogerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 14:10
 */
@Service
public class BlogerServiceImpl implements BlogerService{
    @Autowired
    AdminEntityMapper adminEntityMapper;

    public int updateBloger(AdminEntity adminEntity) {
        return adminEntityMapper.updateByPrimaryKeySelective(adminEntity);
    }

    public AdminEntity getAdmin(Integer id) {
        return adminEntityMapper.selectByPrimaryKey(id);
    }
}
