package com.atguigu.springcloud.service;


import com.atguigu.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

//创建接口，使用feign客户端负载均衡
@FeignClient(value = "springcloud2-dept")
public interface DeptClientService {
    @RequestMapping(value = "/dept/findById/{id}",method = RequestMethod.GET)
     Dept findById(@PathVariable("id")long id);

    @RequestMapping(value = "/dept/findAll",method = RequestMethod.GET)
     List<Dept> findAll();

    @RequestMapping(value = "/dept/addDept",method = RequestMethod.POST)
     boolean addDept(Dept dept);




}
