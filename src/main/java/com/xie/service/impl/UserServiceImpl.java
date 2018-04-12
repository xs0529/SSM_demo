package com.xie.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xie.dao.UserEntityMapper;
import com.xie.entity.MessageEntity;
import com.xie.entity.UserEntity;
import com.xie.entity.UserEntityExample;
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

    public UserEntity selectByEmail(String email) {
        UserEntityExample userEntityExample = new UserEntityExample();
        userEntityExample.createCriteria().andUserEmailEqualTo(email);
        List<UserEntity> userEntities =  userEntityMapper.selectByExample(userEntityExample);
        if (userEntities.size()>0){
            return userEntities.get(0);
        }
        return null;
    }

    public PageInfo<UserEntity> userPageInfo(Integer pageNumber, Integer count) {
        PageHelper.startPage(pageNumber,count);
        List<UserEntity> list = userEntityMapper.selectByExample(null);
        PageInfo<UserEntity> pageInfo = new PageInfo<UserEntity>(list);
        return pageInfo;
    }

    public int updataUserStatus(long id, String status) {
        UserEntity userEntity = userEntityMapper.selectByPrimaryKey(id);
        userEntity.setUserStatus(status);
        return userEntityMapper.updateByPrimaryKey(userEntity);
    }

    public UserEntity selectById(long id) {
        return userEntityMapper.selectByPrimaryKey(id);
    }
}
