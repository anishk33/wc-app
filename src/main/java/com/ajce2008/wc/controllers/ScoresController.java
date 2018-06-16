package com.ajce2008.wc.controllers;

import com.ajce2008.wc.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScoresController {

    @Autowired private ScoreService scoreService;

    @GetMapping("/score")
    public String score(Model model) {
        model.addAttribute("scores", scoreService.getAllScoreDataList());
        return "scores";
    }
}
