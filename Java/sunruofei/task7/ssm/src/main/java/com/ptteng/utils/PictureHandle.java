package com.ptteng.utils;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.GetObjectRequest;

import java.io.File;


/**
 * @ClassName PictureHandle
 * @Description TODO
 * @Author 孙若飞
 * @Date 2019/3/16  19:29
 * @Version 1.0
 **/
public class PictureHandle {

    public static void photo(){
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://oss-cn-beijing.aliyuncs.com";
// 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        String accessKeyId = "LTAIe00haO3zH3SR";
        String accessKeySecret = "GYJpO2NPHbfWKteZrvLC5smoEVIYpb";
        String bucketName = "sundamao";
        String objectName = "777.jpg";
// 创建OSSClient实例。
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
// 缩放
//        String style = "image/resize,m_fixed,w_100,h_100";
//        GetObjectRequest request = new GetObjectRequest(bucketName, objectName);
//        request.setProcess(style);
//        ossClient.getObject(request, new File("D:/ff.jpg"));
// 裁剪
//        style = "image/crop,w_100,h_100,x_100,y_100,r_1";
//        request = new GetObjectRequest(bucketName, objectName);
//        request.setProcess(style);
//        ossClient.getObject(request, new File("example-crop.jpg"));
// 旋转
//       String  style = "image/rotate,90";
//      GetObjectRequest  request = new GetObjectRequest(bucketName, objectName);
//        request.setProcess(style);
//        ossClient.getObject(request, new File("D:/ff.jpg"));
//// 锐化
//        style = "image/sharpen,100";
//        request = new GetObjectRequest(bucketName, objectName);
//        request.setProcess(style);
//        ossClient.getObject(request, new File("example-sharpen.jpg"));
//// 水印
       String  style = "image/watermark,text_SGVsbG8g5Zu-54mH5pyN5YqhIQ";
        GetObjectRequest request = new GetObjectRequest(bucketName, objectName);
        request.setProcess(style);
        ossClient.getObject(request, new File("D:/ff.jpg"));
//// 格式转换
//        style = "image/format,png";
//        request = new GetObjectRequest(bucketName, objectName);
//        request.setProcess(style);
//        ossClient.getObject(request, new File("example-format.png"));
//// 获取图片信息
//        style = "image/info";
//        request = new GetObjectRequest(bucketName, objectName);
//        request.setProcess(style);
//        ossClient.getObject(request, new File("example-info.txt"));
// 关闭OSSClient。
        ossClient.shutdown();
    }

    public static void main(String[] args) {
        photo();
    }


}