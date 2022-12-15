package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class MessageController {

    @GetMapping("/message")
    public String message(Model model) {
        model.addAttribute("username", "Mary");
        model.addAttribute("nickname", "<h1>Baby</h1>");
        model.addAttribute("scores", Arrays.asList(100, 40, 70, 55));
        return "message";
    }
}
