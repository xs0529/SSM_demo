package com.xie.controller;

import com.xie.util.AddressUtils;
import com.xie.util.ResultSet;
import com.xie.util.SystemUtil;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 14:46
 */
@RestController
@RequestMapping("/blog/record")
public class RecordController {
    @GetMapping
    public ResultSet getIp(HttpServletRequest httpRequest) throws UnsupportedEncodingException {
        String ip = SystemUtil.getIpAddr(httpRequest);
        System.out.println(ip);
        System.out.println(AddressUtils.getAddressCity("ip="+ip, "utf-8"));
        return ResultSet.success();
    }
}
