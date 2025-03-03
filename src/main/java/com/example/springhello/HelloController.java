package com.example.springhello;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    //UC1
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }


}

