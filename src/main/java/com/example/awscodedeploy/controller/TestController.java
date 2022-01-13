package com.example.awscodedeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author even
 * @Describe
 * @Time 2022/01/13 20:50:13
 */
@RestController("/test")
public class TestController {
    @GetMapping("/hello")
    public String test(){
        return "hello world!";
    }
}
