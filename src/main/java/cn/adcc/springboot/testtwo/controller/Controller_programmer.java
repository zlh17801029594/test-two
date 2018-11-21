package cn.adcc.springboot.testtwo.controller;

import cn.adcc.springboot.testtwo.bean.Programmer;
import cn.adcc.springboot.testtwo.bean.mapper.ProgrammerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Controller_programmer {

    @Autowired
    ProgrammerMapper programmerMapper;

    @RequestMapping("/prog")
    public String listProgrammer(Model model) {
        List<Programmer> programmers = programmerMapper.findAll();
        model.addAttribute("programmers",programmers);
        return "progView";
    }
}
