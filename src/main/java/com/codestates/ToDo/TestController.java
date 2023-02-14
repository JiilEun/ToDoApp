package com.codestates.ToDo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String helloPreProject() {
        return "To-do Application !";
    }
}
