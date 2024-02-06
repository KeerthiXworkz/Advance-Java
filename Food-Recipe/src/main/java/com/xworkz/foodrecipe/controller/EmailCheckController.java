package com.xworkz.foodrecipe.controller;

import com.xworkz.foodrecipe.service.FoodRecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/")
public class EmailCheckController {

        @Autowired
        public FoodRecipeService service;

        @GetMapping("checkEmail")
        public String checkEmail(@RequestParam String userEmail){

            System.out.println("checking email");
            if(service.checkEmail(userEmail)){
                System.out.println("userEmail"+ userEmail);
                return "true";
            }
            return "false";
        }
    }

