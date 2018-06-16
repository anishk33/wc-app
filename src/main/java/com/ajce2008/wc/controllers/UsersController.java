package com.ajce2008.wc.controllers;

import com.ajce2008.wc.models.User;
import com.ajce2008.wc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UsersController {

    @Autowired private UserService userService;

    @GetMapping("/user")
    public String user(Model model) {
        List<User> users = userService.getAllUsersSorted();
        model.addAttribute("users", users);
        return "users";
    }
}
