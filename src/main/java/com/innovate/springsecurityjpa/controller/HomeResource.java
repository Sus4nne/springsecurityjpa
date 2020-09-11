package com.innovate.springsecurityjpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String home() {
        return ("Welcome");
    }

    @GetMapping("/user")
    public String user() {
        return  ("<h1>Welcome user</h1> <a href=\"/logout\">Click here to logout</a> ");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome Admin</h1>");
    }
}
