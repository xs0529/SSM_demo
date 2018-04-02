package com.xie.service.impl;

import com.xie.dao.AxisEntityMapper;
import com.xie.entity.AxisEntity;
import com.xie.service.AxisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 14:02
 */
@Service
public class AxisServiceImpl implements AxisService{
    @Autowired
    AxisEntityMapper axisEntityMapper;

    public int addAxis(AxisEntity axisEntity) {
        axisEntity.setTimeAxisCtime(new Date());
        axisEntity.setTimeAxisMtime(new Date());
        return axisEntityMapper.insertSelective(axisEntity);
    }

    public int updateAxis(AxisEntity axisEntity) {
        axisEntity.setTimeAxisMtime(new Date());
        return axisEntityMapper.updateByPrimaryKeySelective(axisEntity);
    }

    public int deleteAxis(Integer id) {
        return axisEntityMapper.deleteByPrimaryKey(id);
    }

    public List<AxisEntity> axisList() {
        return axisEntityMapper.selectByExample(null);
    }
}
