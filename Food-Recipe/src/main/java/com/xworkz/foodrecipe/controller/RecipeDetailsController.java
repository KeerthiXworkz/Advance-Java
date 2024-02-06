package com.xworkz.foodrecipe.controller;

import com.xworkz.foodrecipe.dto.RecipeDto;
import com.xworkz.foodrecipe.service.FoodRecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/recipes")
public class RecipeDetailsController {

    private FoodRecipeService service;

    @GetMapping("all")
    public  String getAllRecipes(){

      List<RecipeDto> list= service.getAllRecipes();

        System.out.println(list);
        return "dashboard";
    }
}

//        if (recipeDto!=null){
//
//            System.out.println("saving the recipe");
//
//
//            UserDto userDetails = (UserDto) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//            String loggedInUsername = userDetails.getFirstName();
//
//            // Set the user-specific details
//         //   recipeDto.setUserId(Integer.parseInt(loggedInUsername));
//
//            // Handle the publicRecipe field
//            if (request.getParameter("publicRecipe") != null) {
//                boolean isPublicRecipe = Boolean.parseBoolean(request.getParameter("publicRecipe"));
//                recipeDto.setPublishRecipe(isPublicRecipe);
//            }
