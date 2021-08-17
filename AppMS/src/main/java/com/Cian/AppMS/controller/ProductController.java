package com.Cian.AppMS.controller;

import com.Cian.AppMS.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String pageDesu(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "index";
    }
}
