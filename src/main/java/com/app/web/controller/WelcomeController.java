package com.app.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class WelcomeController {

    @GetMapping("/today")
    public String index(Model model) {
        model.addAttribute("msg", getMessage());
        model.addAttribute("today", new Date());
        return "index";

    }

    private String getMessage() {
        return "Hello World";
    }

}
