package com.app.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class WelcomeController {

    @GetMapping("/form")
    public String index(Model model) {
        model.addAttribute("title", getTitle());
        return "index";
    }

    private String getTitle() {
        return "VyVS";
    }

}
