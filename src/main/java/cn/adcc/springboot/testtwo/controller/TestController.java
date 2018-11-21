package cn.adcc.springboot.testtwo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${student.name}")
    private String name;

    @Value("${student.age}")
    private String age;

    @RequestMapping("/xiaozhou")
    public String myResp(){
        return "Hello !" + name + "," + age + "?" ;
    }

}
