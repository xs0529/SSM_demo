package com.xie.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 谢霜
 * @Description 封装json返回对象
 * @date 2018/3/29 13:51
 */
public class ResultSet {
    /*
    * 状态码
    */
    private int code ;
    /*
    * 提示信息
    */
    private  String message;
    /*
    * 要返回的数据
    */
    private Map<String,Object> date = new HashMap<String, Object>();
    /*
     * @author 谢霜
     * @Description 直接返回一个成功的结果集
     * @params  * @param  
     * @return com.xie.util.ResultSet
     * @date 2018/3/29 14:09
     */
    public static ResultSet success(){
        ResultSet resultSet = new ResultSet();
        resultSet.setCode(200);
        resultSet.setMessage("处理成功");
        return resultSet;
    }
    /*
     * @author 谢霜
     * @Description 直接返回一个失败的结果集
     * @params  * @param
     * @return com.xie.util.ResultSet
     * @date 2018/3/29 14:09
     */
    public static ResultSet fail(){
        ResultSet resultSet = new ResultSet();
        resultSet.setCode(500);
        resultSet.setMessage("处理失败");
        return resultSet;
    }
    /*
     * @author 谢霜
     * @Description 向结果集中添加数据
     * @params  * @param key
     * @param value
     * @return com.xie.util.ResultSet
     * @date 2018/3/29 14:10
     */
    public ResultSet add(String key ,Object value){
        this.getDate().put(key,value);
        return this;
    }
    /*
     * @author 谢霜
     * @Description 设置处理成功的消息
     * @params  * @param
     * @return void
     * @date 2018/3/29 14:11
     */
    public void setSuccess(){
        this.setCode(200);
        this.setMessage("处理成功");
    }
    /*
     * @author 谢霜
     * @Description 设置处理失败的消息
     * @params  * @param
     * @return void
     * @date 2018/3/29 14:12
     */
    public void setFail(){
        this.setCode(500);
        this.setMessage("处理失败");
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getDate() {
        return date;
    }

    public void setDate(Map<String, Object> date) {
        this.date = date;
    }
}
