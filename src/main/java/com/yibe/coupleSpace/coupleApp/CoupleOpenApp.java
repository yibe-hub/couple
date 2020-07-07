package com.yibe.coupleSpace.coupleApp;

import com.yibe.coupleSpace.service.CoupleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/couple")
public class CoupleOpenApp {
    @Autowired
    private CoupleService coupleService;

    @GetMapping("/hello")
    public String home() {
        return "Hello World!";
    }

    @GetMapping("/user")
    public String user() {
        return "Hello User!";
    }
}
