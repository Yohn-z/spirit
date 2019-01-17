package com.spirit.constant;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 配置文件类
 */
@Component
public class ConstantProperties implements InitializingBean {

    @Value("${java.file.endpoint}")
    private String java_file_endpoint;

    @Value("${java.file.keyid}")
    private String java_file_keyid;

    @Value("${java.file.keysecret}")
    private String java_file_keysecret;

    @Value("${java.file.bucketname}")
    private String java_file_bucketname;

    @Value("${java.file.filehost}")
    private String java_file_filehost;


    public static String JAVA_FILE_ENDPONT;

    public static String JAVA_FILE_KEYID;

    public static String JAVA_FILE_KEYSECRET;

    public static String JAVA_FILE_BUCKETNAME;

    public static String JAVA_FILE_FILEHOST;


    @Override
    public void afterPropertiesSet() throws Exception {

        JAVA_FILE_ENDPONT = java_file_endpoint;

        JAVA_FILE_KEYID = java_file_keyid;

        JAVA_FILE_KEYSECRET = java_file_keysecret;

        JAVA_FILE_BUCKETNAME = java_file_bucketname;

        JAVA_FILE_FILEHOST = java_file_filehost;

    }
}
