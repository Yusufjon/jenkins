package com.example.javatestingproject;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping ("/")
    @ResponseBody
    String hello() {
        return "Hello World, Spring Boot!";
    }
}
