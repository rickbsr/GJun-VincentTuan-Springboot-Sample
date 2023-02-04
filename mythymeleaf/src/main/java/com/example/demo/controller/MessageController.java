package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class MessageController {

    @GetMapping("/message")
    public String message(Model model) {

        List<Map<String, String>> users = new ArrayList<>();

        Map<String, String> userJohn = new LinkedHashMap<>();
        userJohn.put("name", "John");
        userJohn.put("age", "18");

        Map<String, String> userMary = new LinkedHashMap<>();
        userJohn.put("name", "Mary");
        userJohn.put("age", "19");

        users.add(userJohn);
        users.add(userMary);

        /*

        練習：

        請在 message.html 中呈現表格 Table 樣式如下：

        +------+-----+
        | name | age |
        +------+-----+
        | John |  18 |
        +------+-----+
        | Mary |  19 |
        +------+-----+

         */

        model.addAttribute("username", "Mary");
        model.addAttribute("nickname", "<h1>Baby</h1>");
        model.addAttribute("scores", Arrays.asList(100, 40, 70, 55));
        return "message";
    }
}
