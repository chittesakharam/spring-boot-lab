package com.nt.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.Product;

@Controller
public class ProductController {

    
    @GetMapping("/")
    public String home() {
        return "search";
    }

    @GetMapping("/search")
    public String searchProduct(
            @RequestParam(required = false) String productName,
            @RequestParam(required = false) String category,
            Model model) {

       Product p = new Product(101,productName,category,600.0);

        model.addAttribute("prod", p);

        return "result";
    }
}