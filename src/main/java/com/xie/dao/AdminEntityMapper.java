package com.xie.dao;

import com.xie.entity.AdminEntity;
import com.xie.entity.AdminEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminEntityMapper {
    long countByExample(AdminEntityExample example);

    int deleteByExample(AdminEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminEntity record);

    int insertSelective(AdminEntity record);

    List<AdminEntity> selectByExample(AdminEntityExample example);

    AdminEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminEntity record, @Param("example") AdminEntityExample example);

    int updateByExample(@Param("record") AdminEntity record, @Param("example") AdminEntityExample example);

    int updateByPrimaryKeySelective(AdminEntity record);

    int updateByPrimaryKey(AdminEntity record);
}