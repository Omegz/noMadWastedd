package com.example.myspringguidemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "home/index";
    }

    @GetMapping("/personData")
    public String showPersonData() {
        return "home/personData";
    }

    @PostMapping("/personData")
    public String personData(@RequestParam String firstName,
                             @RequestParam String lastName,
                             Model model) {
        model.addAttribute("claus", new Person(firstName, lastName));
        return "home/personData";
    }

    private record Person(String firstName, String lastName) {}
}