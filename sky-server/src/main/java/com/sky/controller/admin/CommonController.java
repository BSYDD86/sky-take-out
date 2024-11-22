package com.sky.controller.admin;

import com.sky.constant.MessageConstant;
import com.sky.result.Result;
import com.sky.utils.AliOssUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/admin/common")
@Api(tags="通用接口")
@Slf4j
public class CommonController {
    @Autowired
    private AliOssUtil aliOssUtil;
    //文件上传
    @PostMapping("/upload")
    @ApiOperation("文件上传")
    public Result<String> upload(MultipartFile file){
        log.info("文件上传：{}",file);
//        try {
//            System.out.println("未配置阿里oss，仅仅测试用");
//
//            String originalFilename = file.getOriginalFilename();//原始文件名
//            //截取原始文件名的的后缀
//            String extention = originalFilename.substring(originalFilename.lastIndexOf("."));
//            //构造新文件名称
//            String objectName = UUID.randomUUID().toString()+extention;
//            //文件的请求路径
//            String filePath = aliOssUtil.upload(file.getBytes(), objectName);
//            return Result.success(filePath);
//        }catch(IOException e){
//            log.error("文件上传失败：{}",e);
//        }
        return Result.success();
//        return Result.error(MessageConstant.UPLOAD_FAILED);
    }}