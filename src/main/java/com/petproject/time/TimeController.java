package com.petproject.time;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TimeController {

    @GetMapping
    public String getHelloWorld(String message) {
        return LocalDateTime.now() + ": " + message + "<br> <a href=\"http://localhost/test\">Visit Test</a>";
    }

    @GetMapping("/test")

    public String getTest() {
        return "TEST <br> <a href=\"http://localhost\">Return</a>";
    }

}
