package com.app.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.app.web.controller.Greeter;

@Controller
public class WelcomeController {

    @GetMapping("/form")
    public String index(Model model) {
        model.addAttribute("title", Greeter.getTitle());
        model.addAttribute("date", Greeter.getDate());
        model.addAttribute("sum", Greeter.getSum("12+8+5"));
        return "index";
    }
}
