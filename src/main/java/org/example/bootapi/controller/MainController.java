package org.example.bootapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping
    public String index(Model model) {
        model.addAttribute("message", "밤피카츄 언제와");
        model.addAttribute("message", "누가 교환좀 해줘라!!");
        return "index";
    }
}
