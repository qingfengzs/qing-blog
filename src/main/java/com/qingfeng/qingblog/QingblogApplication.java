package com.qingfeng.qingblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.qingfeng.qingblog.dao")
public class QingblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(QingblogApplication.class, args);
    }

}
