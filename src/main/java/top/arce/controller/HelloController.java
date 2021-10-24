package top.arce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.arce.pojo.Car;
import top.arce.pojo.Person;

/**
 * @program: bootstudy
 * @description: hello测试
 * @author: charles
 * @create: 2021-10-23 11:01
 **/
@RestController
public class HelloController {

    @Autowired
    Car car;
    @Autowired
    Person person;

    @RequestMapping("/car")
    public Car car(){
        return car;
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/person")
    public Person person(){
        return person;
    }
}
