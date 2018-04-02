package com.xie.service;

import com.xie.entity.AdminEntity;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 14:07
 */
public interface BlogerService {
    int updateBloger(AdminEntity adminEntity);
    AdminEntity getAdmin(Integer id);
}
