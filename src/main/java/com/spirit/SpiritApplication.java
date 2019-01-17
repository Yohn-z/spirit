package com.spirit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.spirit.mapper")
public class SpiritApplication {

    public static void main(String[] args){
        SpringApplication.run(SpiritApplication.class,args);
    }
}
