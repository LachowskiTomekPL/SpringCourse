package com.example.springproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class MainController {
    @RequestMapping("/hello")
    public String index(HttpServletResponse response){
        response.addHeader("Spring","kurs");
        System.out.println("index");
        return "Hello World";
    }
}
