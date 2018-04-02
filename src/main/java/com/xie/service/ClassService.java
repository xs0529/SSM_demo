package com.xie.service;

import com.xie.entity.ClassEntity;

import java.util.List;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 11:32
 */
public interface ClassService {
    /*
     * @author 谢霜
     * @Description 新增分类
     * @params  * @param classEntity
     * @return int
     * @date 2018/4/2 11:41
     */
    int addClass(ClassEntity classEntity);
    /*
     * @author 谢霜
     * @Description 修改分类
     * @params  * @param classEntity
     * @return int
     * @date 2018/4/2 11:42
     */
    int updateClass(ClassEntity classEntity);
    /*
     * @author 谢霜
     * @Description 删除分类
     * @params  * @param id 
     * @return int
     * @date 2018/4/2 11:42
     */
    int deleteClass(Integer id);
    /*
     * @author 谢霜
     * @Description 分类列表
     * @params  * @param  
     * @return java.util.List<com.xie.entity.ClassEntity>
     * @date 2018/4/2 11:42
     */
    List<ClassEntity> ClassList();
    ClassEntity getClass(Integer id);
}
