package com.xie.service.impl;

import com.xie.dao.UserEntityMapper;
import com.xie.entity.UserEntity;
import com.xie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 14:15
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserEntityMapper userEntityMapper;

    public int addUser(UserEntity userEntity) {
        userEntity.setUserCtime(new Date());
        userEntity.setUserMtime(new Date());
        return userEntityMapper.insertSelective(userEntity);
    }

    public int updateUser(UserEntity userEntity) {
        userEntity.setUserMtime(new Date());
        return userEntityMapper.updateByPrimaryKeySelective(userEntity);
    }

    public int deleteUser(long id) {
        return userEntityMapper.deleteByPrimaryKey(id);
    }

    public List<UserEntity> userList() {
        return userEntityMapper.selectByExample(null);
    }
}
