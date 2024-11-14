package com.mrrikimaru.softwaredesign.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/add-product")
    public String addProductPage() {
        return "add-product";
    }
}
