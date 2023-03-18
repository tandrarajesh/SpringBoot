package com.mphasis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping("/hello")
    public String Hello(){
        return "Hello World!!! from rajesh ";
    }
}
