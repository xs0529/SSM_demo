package com.xie.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/3 14:53
 */
public class LayuiResult {
    Map set = new HashMap();

    public LayuiResult add(String name,Object value){
        this.getSet().put(name,value);
        return this;
    }

    public LayuiResult setSuccess(){
        this.getSet().put("code",0);
        this.getSet().put("msg","操作成功");
        return this;
    }

    public LayuiResult setFail(){
        this.getSet().put("code",500);
        this.getSet().put("msg","操作失败");
        return this;
    }

    public Map getSet() {
        return set;
    }

    public void setSet(Map set) {
        this.set = set;
    }
}
