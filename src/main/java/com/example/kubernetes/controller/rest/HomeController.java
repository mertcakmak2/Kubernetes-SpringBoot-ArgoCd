package com.example.kubernetes.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from kubernetes v3 argo cd";
    }

}
