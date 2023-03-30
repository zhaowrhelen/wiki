package com.example.wiki_helen.controller;

import com.example.wiki_helen.domain.Test;
import com.example.wiki_helen.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {


    @Resource
    private TestService testService;

    @Value("13579")
    private String testHello;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World" + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World,post " + name;
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
