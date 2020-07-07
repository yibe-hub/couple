package com.tontron.web.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/couple")
public class CoupleOpenApp {


    @GetMapping("/hello")
    public String home() {
        return "Hello World!";
    }

    @GetMapping("/user")
    public String user() {
        return "Hello User!";
    }
}
