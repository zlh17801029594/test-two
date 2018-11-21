package cn.adcc.springboot.testtwo.controller;

import cn.adcc.springboot.testtwo.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller_liugou {

    @Autowired
    private Student student;

    @RequestMapping("/liugou")
    public String myResp(){
        return student.getName() + "," + student.getAge();
    }
}
