package com.example.jenkinsDemo.xxx;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/get")
    @ResponseBody
    public String get(){

        return "nihao";
    }
}
