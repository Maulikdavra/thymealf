package com.example.thymealfdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class PersonController {

    @GetMapping("/people")
    public String getPeople(Model model){
        model.addAttribute("something", "getPeople method from PersonController class");
        return "people";
    }
}
