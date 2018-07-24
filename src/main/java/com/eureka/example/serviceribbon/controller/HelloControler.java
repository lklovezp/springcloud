package com.eureka.example.serviceribbon.controller;

import com.eureka.example.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/h1")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
