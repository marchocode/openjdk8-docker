package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/docker")
@RestController
public class DockerController {

    @GetMapping("/hello")
    public String hello() {
        return "hello docker hub";
    }

}
