package cn.adcc.springboot.testtwo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

@Controller
public class Controller_jsp {

    @RequestMapping("/jsp")
    public String myResp(Model m){
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "index";
    }
}
