package com.atgugui.springcloud2.cfgbean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@Configuration
public class ConfigBean//boot-->配置类 @Configuration配置
{
    @Bean
    @LoadBalanced   //Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端  负载均衡的工具
    public RestTemplate getRestTemplate(){
        String s = "hello";
        char c = s.charAt(0);

        return new RestTemplate();
    }




}
