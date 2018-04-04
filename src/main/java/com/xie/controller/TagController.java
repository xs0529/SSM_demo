package com.xie.controller;

import com.alibaba.fastjson.JSON;
import com.xie.entity.TagEntity;
import com.xie.service.TagService;
import com.xie.util.LayuiResult;
import com.xie.util.ResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 14:43
 */
@RestController
@RequestMapping("/blog/tag")
public class TagController {
    @Autowired
    TagService tagService;

    @GetMapping
    public String getTag(){
        LayuiResult layuiResult = new LayuiResult();
        layuiResult.setSuccess();
        layuiResult.add("data",tagService.tagList());
        return JSON.toJSONString(layuiResult.getSet()).toString();
    }
    @PutMapping
    public ResultSet updataTag(TagEntity tagEntity){
        if (tagService.updateTag(tagEntity)>0){
            return ResultSet.success();
        }
        return ResultSet.fail();
    }
    @PostMapping
    public ResultSet addTag(TagEntity tagEntity){
        if (tagService.addTag(tagEntity)>0){
            return ResultSet.success();
        }
        return ResultSet.fail();
    }
    @DeleteMapping("/{id}")
    public ResultSet deleteTag(@PathVariable("id")Integer id){
        if (tagService.deleteTag(id)>0){
            return ResultSet.success();
        }
        return ResultSet.fail();
    }
}
