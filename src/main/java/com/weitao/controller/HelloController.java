package com.weitao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(path = "/hello")
    public String hello(){
        System.out.println("测试hello");
        return "success";
    }

}
