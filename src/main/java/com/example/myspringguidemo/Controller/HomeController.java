package com.example.myspringguidemo.Controller;

import com.example.myspringguidemo.Model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "home/index";
    }
    @PostMapping("/personData")
    public String personData(@ModelAttribute Person person, Model model){

        model.addAttribute("claus",person);

        return "home/personData";
    }
}
// hellowhss