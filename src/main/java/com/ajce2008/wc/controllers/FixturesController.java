package com.ajce2008.wc.controllers;

import com.ajce2008.wc.services.FixtureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FixturesController {

    @Autowired private FixtureService fixtureService;

    @GetMapping("/fixture")
    public String fixture(Model model) {
        model.addAttribute("fixtures", fixtureService.getAllFixturesPopulated());
        return "fixtures";
    }
}
