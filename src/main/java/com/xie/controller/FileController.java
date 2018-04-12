package com.xie.controller;

import com.xie.util.ResultSet;
import javafx.scene.shape.Path;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/3 9:58
 */
@RestController
@RequestMapping("/blog/file")
public class FileController {

    public ResultSet springUpload(HttpServletRequest request) throws IllegalStateException, IOException {
        long startTime = System.currentTimeMillis();
        //将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
                request.getSession().getServletContext());
        //检查form中是否有enctype="multipart/form-data"
        if (multipartResolver.isMultipart(request)) {
            //将request变成多部分request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            //获取multiRequest 中所有的文件名
            Iterator iter = multiRequest.getFileNames();

            while (iter.hasNext()) {
                //一次遍历所有文件
                MultipartFile file = multiRequest.getFile(iter.next().toString());
                if (file != null) {
                    String path = "D:/blog/blogPage/images" + file.getOriginalFilename();
                    //上传
                    file.transferTo(new File(path));
                }

            }

        }
        return ResultSet.success().add("url","66");
    }

    public String muchFileUpload(@RequestParam MultipartFile[] myfiles, HttpServletRequest request) throws IOException {
        for(MultipartFile file : myfiles){
            //此处MultipartFile[]表明是多文件,如果是单文件MultipartFile就行了
            if(file.isEmpty()){
                System.out.println("文件未上传!");
            }
            else{
                //得到上传的文件名
                String fileName = file.getOriginalFilename();
                //得到服务器项目发布运行所在地址
                String path1 = request.getSession().getServletContext().getRealPath("image")+File.separator;
                //  此处未使用UUID来生成唯一标识,用日期做为标识
                String path = path1+ new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+ fileName;
                //查看文件上传路径,方便查找
                System.out.println(path);
                //把文件上传至path的路径
                File localFile = new File(path);
                file.transferTo(localFile);
            }
        }
        return "uploadSuccess";
    }
    @PostMapping("/onefile")
    public ResultSet oneFileUpload(@RequestParam("file") MultipartFile file,HttpServletRequest request) throws IOException {
        String url;
            if(file.isEmpty()){
                ResultSet resultSet = ResultSet.fail();
                resultSet.setMessage("文件为空，上传失败");
                return resultSet;
            }
            else{
                //得到上传的文件名
                String fileName = file.getOriginalFilename();
                String path1 = "/usr/local/blog/blogPage/images/";
                //  此处未使用UUID来生成唯一标识,用日期做为标识
                String path2 = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+ fileName;
                //把文件上传至path的路径
                String path = path1 + path2;
                File localFile = new File(path);
                file.transferTo(localFile);
                url = "/blog/blogPage/images/"+ path2;
            }
        return ResultSet.success().add("url",url);
    }
}