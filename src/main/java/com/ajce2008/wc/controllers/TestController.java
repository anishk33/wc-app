package com.ajce2008.wc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @GetMapping("/test")
    public String test(@RequestParam(name = "value", required = false) String value, Model model) {
        model.addAttribute("value", value);
        return "page";
    }
}
