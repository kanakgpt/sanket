package com.ibm.emp_mangmnt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
    //"hello world" endpoint
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }
}
