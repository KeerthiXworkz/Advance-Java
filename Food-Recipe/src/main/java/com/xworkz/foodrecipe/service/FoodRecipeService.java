package com.xworkz.foodrecipe.service;

import com.xworkz.foodrecipe.dto.RecipeDto;
import com.xworkz.foodrecipe.dto.UserDto;

import java.util.List;

public interface FoodRecipeService {

    public void validateAndSave(UserDto dto);

    List<UserDto> getAllUser();

    List<UserDto> login(String email,String password);
    UserDto getUser(int userId);

    boolean updateUser(int userId,UserDto dto);

    boolean deleteUser(int userId);

    void saveAndValidateRecipe(RecipeDto recipeDto);

//    void saveAndValidateIngredient(IngredientDto ingredientDto);

    List<RecipeDto> getAllRecipes();

    List<RecipeDto> getMyRecipes();

    boolean checkEmail(String email);
}
