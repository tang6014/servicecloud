package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//注册进eureka
public class DeptProvider8002_App {
    public static void main(String[] args){
        SpringApplication.run(DeptProvider8002_App.class,args);
    }
}
