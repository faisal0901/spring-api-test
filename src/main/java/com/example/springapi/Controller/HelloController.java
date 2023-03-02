package com.example.springapi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {
    @GetMapping
    public String Hello(){
        return "hello world";
    }
    @PostMapping
    public String Hellow(){
        return "hello world";
    }


}
