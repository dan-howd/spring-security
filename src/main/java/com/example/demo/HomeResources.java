package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeResources {

    @RequestMapping("/")
    public String home(){

        return "<h1> Welcome </h1>";
    }

    @RequestMapping("/admin")
    public String admin(){

        return "<h1> Welcome ADMIN </h1>";
    }

    @RequestMapping("/user")
    public String user(){

        return "<h1> Welcome USER </h1>";
    }
}
