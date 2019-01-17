package com.spirit.oss;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.CannedAccessControlList;
import com.aliyun.oss.model.CreateBucketRequest;
import com.aliyun.oss.model.PutObjectRequest;
import com.aliyun.oss.model.PutObjectResult;
import com.spirit.constant.ConstantProperties;
import com.spirit.util.IDUtils;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
* @Description:    aliyunOSS工具类
* @Author:         印国林
* @CreateDate:     2018/10/31/031 21:43
* @Version:        1.0
*/
public class AliyunOSSUtil {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(AliyunOSSUtil.class);

    /**
     * 普通文件上传
     * @param file
     * @return
     */
    public static String normalFileUpload(File file){
        logger.info("---------------OSS文件开始上传------------------");

        String endpoint = ConstantProperties.JAVA_FILE_ENDPONT;
        String accessKeyId = ConstantProperties.JAVA_FILE_KEYID;
        String accessKeySecret = ConstantProperties.JAVA_FILE_KEYSECRET;
        String bucketName = ConstantProperties.JAVA_FILE_BUCKETNAME;
        String fileHost = ConstantProperties.JAVA_FILE_FILEHOST;

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = dateFormat.format(new Date());

        if(file == null){
            return  null;
        }

        //创建OSSClient对象
        OSSClient ossClient = new OSSClient(endpoint,accessKeyId,accessKeySecret);

        try{
            //名为bucketName的容器不存在，就创建
            if(!ossClient.doesBucketExist(bucketName)){
                ossClient.createBucket(bucketName);
                CreateBucketRequest createBucketRequest = new CreateBucketRequest(bucketName);
                //设置权限
                createBucketRequest.setCannedACL(CannedAccessControlList.PublicRead);
                ossClient.createBucket(createBucketRequest);
            }

            //创建文件路径
            String fileUrl = fileHost+ "/" + (dateStr+ "/" +file.getName());

            //上传文件
            PutObjectResult putObjectResult = ossClient.putObject(new PutObjectRequest(bucketName, fileUrl, file));

            //设置权限 公开读
            ossClient.setBucketAcl(bucketName,CannedAccessControlList.PublicRead);

            String url = "https://"+ConstantProperties.JAVA_FILE_BUCKETNAME+"."+ConstantProperties.JAVA_FILE_ENDPONT+"/"+fileUrl;

            if(putObjectResult != null){
                logger.info("---------------OOS文件上传成功---------------");
                logger.error("Oss地址："+url);
                return url;
            }

        }catch (OSSException oe){
            logger.error(oe.getMessage());
        }catch (ClientException ce){
            logger.error(ce.getMessage());
        }finally {
            //关闭
            ossClient.shutdown();
        }

        return null;
    }


    /**
     * MultipartFile文件上传
     * @param multipartFile
     * @return
     * @throws IOException
     */
    public static String MultipartFileUpload(MultipartFile multipartFile) throws IOException {

        // 获取文件名
        String fileName = multipartFile.getOriginalFilename();
        // 获取文件后缀
        String prefix=fileName.substring(fileName.lastIndexOf("."));

        if (prefix.equals(".jpg") || prefix.equals(".png") || prefix.equals(".JPG") || prefix.equals(".PNG")){
            // 用uuid作为文件名，防止生成的临时文件重复
            File excelFile = File.createTempFile(IDUtils.genItemId()+"", prefix);
            // MultipartFile to File
            multipartFile.transferTo(excelFile);

            //上传

            String url = AliyunOSSUtil.normalFileUpload(excelFile);

            //程序结束时，删除临时文件
            deleteFile(excelFile);

            return url;
        }

        return "false";

    }


    /**
     * 删除文件
     * @param files
     */
    private static void deleteFile(File... files) {
        for (File file : files) {
            if (file.exists()) {
                file.delete();
            }
        }
    }
}
