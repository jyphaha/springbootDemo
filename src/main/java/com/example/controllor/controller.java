package com.example.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class controller {

    @RequestMapping("/boot/hello")  //请求路径
    public @ResponseBody  String hello(){
        return "hello the world!";
    }



}
