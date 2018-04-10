package com.xie.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/10 13:27
 */
public class JsonUtil {
    public static String getValueByKey(String json,String key){
        JSONObject jsonObject = JSON.parseObject(json);
        JSONObject jsonObject1 = jsonObject.getJSONObject("data");
            return jsonObject1.getString(key);
    }
}
