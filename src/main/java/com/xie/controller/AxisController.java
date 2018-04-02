package com.xie.controller;

import com.xie.entity.AxisEntity;
import com.xie.service.AxisService;
import com.xie.util.ResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 14:44
 */
@RestController
@RequestMapping("/blog/axis")
public class AxisController {
    @Autowired
    AxisService axisService;

    @PostMapping
    public ResultSet addAxis(AxisEntity axisEntity){
        if (axisService.addAxis(axisEntity)>0){
            return ResultSet.success();
        }
        return ResultSet.fail();
    }

    @PutMapping("/{id}")
    public ResultSet updateAxis(@PathVariable("id") Integer id,AxisEntity axisEntity){
        if (axisService.updateAxis(axisEntity)>0){
            return ResultSet.success();
        }
        return ResultSet.fail();
    }

    @GetMapping
    public ResultSet axisList(){
        return ResultSet.success().add("axisList",axisService.axisList());
    }

    @DeleteMapping("/{id}")
    public ResultSet deleteAxis(@PathVariable("id")Integer id){
        if (axisService.deleteAxis(id)>0){
            return ResultSet.success();
        }
        return ResultSet.fail();
    }
}
