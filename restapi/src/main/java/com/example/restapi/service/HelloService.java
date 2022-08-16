package com.example.restapi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class HelloService {


    public String hello() {
        return "Hello World!";
    }
}
