package com.ajce2008.wc.controllers;

import com.ajce2008.wc.services.PredictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PredictionsController {

    @Autowired private PredictionService predictionService;

    @GetMapping("/prediction")
    public String prediction(Model model) {
        model.addAttribute("predictions", predictionService.getAllPredictionDataList());
        return "predictions";
    }
}
