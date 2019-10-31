package springcloud2.com.atguigu.springcloud.controller;


import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DeptController_consumer {
     @Autowired
    private DeptClientService service ;

     @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
         return this.service.findById(id);
     }

     @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
         System.out.println("来到这了");
         List<Dept> list = this.service.findAll();
          return list;
     }

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(Dept dept){
        return this.service.addDept(dept);
    }

}
