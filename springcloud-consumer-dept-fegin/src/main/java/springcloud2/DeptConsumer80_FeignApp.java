package springcloud2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.atguigu.springcloud")
@Component("com.atguigu.springcloud")
public class DeptConsumer80_FeignApp {
    public static void main(String[] args){

        SpringApplication.run(DeptConsumer80_FeignApp.class,args);
    }
}
