package com.jee.project.resourceserver;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@CrossOrigin("*")

public class WebController {


    @GetMapping("/hello")
    public String hello(HttpServletRequest request) throws IOException {
        return "Hello !! ";
    }
}
