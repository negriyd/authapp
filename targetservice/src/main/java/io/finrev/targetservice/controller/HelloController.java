package io.finrev.targetservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello1")
    String hello1() {
        return "Hello 1";
    }

    @GetMapping("/hello2")
    String hello2() {
        return "Hello 2";
    }

}
