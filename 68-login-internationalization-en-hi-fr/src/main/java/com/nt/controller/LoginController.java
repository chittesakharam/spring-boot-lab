package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.nt.model.Login;
import com.nt.validator.LoginValidator;

@Controller
public class LoginController {

    @Autowired
    private LoginValidator validator;

    // Display Login Page
    @GetMapping("/login")
    public String showLoginPage(@ModelAttribute("login") Login login) {
        return "login";
    }
   

    // Process Login Form
    @PostMapping("/login")
    public String processLogin(@ModelAttribute("login") Login login,
                               BindingResult errors) {

        // Call Validator
        validator.validate(login, errors);

        if (errors.hasErrors()) {
            return "login";
        }

        return "success";
    }
}