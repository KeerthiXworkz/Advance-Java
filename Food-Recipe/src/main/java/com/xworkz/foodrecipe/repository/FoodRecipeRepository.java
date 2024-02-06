package com.xworkz.foodrecipe.repository;

import com.xworkz.foodrecipe.dto.AuditDto;
import com.xworkz.foodrecipe.dto.RecipeDto;
import com.xworkz.foodrecipe.dto.UserDto;

import java.util.List;

public interface FoodRecipeRepository {


    public boolean saveUser(AuditDto dto);



    List<UserDto> getAllUser();

    List<UserDto> getEmailAndContactNumberAndPassword(String email,String password);
    UserDto getUser(int userId);


    boolean updateUser(int userId, UserDto dto);

    boolean deleteUser(int userId);

    void saveRecipe(RecipeDto recipeDto);
//    void saveIngredient(IngredientDto ingredientDto);

    List<RecipeDto> getAllRecipes();


    boolean updateRecipe(RecipeDto recipeDto,int recipeId);
}
