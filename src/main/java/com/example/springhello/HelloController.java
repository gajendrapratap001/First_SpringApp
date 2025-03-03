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

    //UC2
    @GetMapping("/hello/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";

    }

    //UC3
    @GetMapping("/hello/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }


}

