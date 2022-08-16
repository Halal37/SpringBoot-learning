package com.example.restapi.controller;

import com.example.restapi.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @GetMapping("/")
    public String hello(){
        return helloService.hello();
    }
}
