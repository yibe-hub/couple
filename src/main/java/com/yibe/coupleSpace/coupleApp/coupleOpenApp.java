package com.yibe.coupleSpace.coupleApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/couple")
public class coupleOpenApp {

    @GetMapping("/hello")
    public String home() {
        return "Hello World!";
    }
}
