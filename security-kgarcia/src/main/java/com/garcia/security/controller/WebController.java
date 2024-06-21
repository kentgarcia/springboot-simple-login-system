package com.garcia.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/student")
    public String student() {
        return "student/home";
    }

    @GetMapping("/faculty")
    public String faculty() {
        return "faculty/home";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin/home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/403")
    public String error403() {
        return "403";
    }
}
