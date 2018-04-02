package com.xie.controller;

import com.xie.entity.ClassEntity;
import com.xie.service.ClassService;
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

    @GetMapping
    public ResultSet classList(){
        return ResultSet.success().add("classList",classService.ClassList());
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
}
