package com.xie.controller;

import com.alibaba.fastjson.JSON;
import com.xie.entity.ClassEntity;
import com.xie.service.ClassService;
import com.xie.service.TagService;
import com.xie.util.LayuiResult;
import com.xie.util.ResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 14:41
 */
@RestController
@RequestMapping("/blog/class")
public class ClassController {
    @Autowired
    ClassService classService;
    @Autowired
    TagService tagService;

    @GetMapping
    public String classList(){
        LayuiResult layuiResult = new LayuiResult();
        layuiResult.setSuccess();
        layuiResult.add("data",classService.ClassList());
        return JSON.toJSON(layuiResult.getSet()).toString();
    }

    @GetMapping("/{id}")
    public ResultSet getClass(@PathVariable("id")Integer id){
        return ResultSet.success().add("class",classService.getClass(id));
    }

    @PutMapping
    public ResultSet updateClass(ClassEntity classEntity){
        if (classService.updateClass(classEntity)>0){
            return ResultSet.success();
        }
        return ResultSet.fail();
    }

    @PostMapping
    public ResultSet addClass(ClassEntity classEntity){
        if (classService.addClass(classEntity)>0){
            return ResultSet.success();
        }
        return ResultSet.fail();
    }

    @DeleteMapping("/{id}")
    public ResultSet deleteClass(@PathVariable("id")Integer id){
        if (classService.deleteClass(id)>0){
            return ResultSet.success();
        }
        return ResultSet.fail();
    }

    @GetMapping("/tag")
    public ResultSet classAndTag(){
        return ResultSet.success().add("classList",classService.ClassList()).add("tagList",tagService.tagList());
    }
}
