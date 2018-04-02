package com.xie.service;

import com.xie.entity.AxisEntity;

import java.util.List;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 14:00
 */
public interface AxisService {
    int addAxis(AxisEntity axisEntity);
    int updateAxis(AxisEntity axisEntity);
    int deleteAxis(Integer id);
    List<AxisEntity> axisList();
}
