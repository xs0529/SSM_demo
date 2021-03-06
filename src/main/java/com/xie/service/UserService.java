package com.xie.service;

import com.github.pagehelper.PageInfo;
import com.xie.entity.UserEntity;

import java.util.List;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 14:13
 */
public interface UserService {
    int addUser(UserEntity userEntity);
    int updateUser(UserEntity userEntity);
    int deleteUser(long id);
    List<UserEntity> userList();
    UserEntity selectByEmail(String email);
    PageInfo<UserEntity> userPageInfo(Integer pageNumber, Integer count);
    int updataUserStatus(long id,String status);
    UserEntity selectById(long id);
}
