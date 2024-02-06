package com.xworkz.foodrecipe.service.impl;

import com.xworkz.foodrecipe.dto.AuditDto;
import com.xworkz.foodrecipe.dto.RecipeDto;
import com.xworkz.foodrecipe.dto.UserDto;
import com.xworkz.foodrecipe.mail.Mail;
import com.xworkz.foodrecipe.passwordEncryptDecrypt.PasswordEncodeDecode;
import com.xworkz.foodrecipe.repository.FoodRecipeRepository;
import com.xworkz.foodrecipe.repository.impl.FoodRecipeRepositoryImpl;
import com.xworkz.foodrecipe.service.FoodRecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FoodRecipeServiceImpl implements FoodRecipeService {

    @Autowired
    private FoodRecipeRepository repository;

    @Autowired
  private   Mail mail;

    @Autowired
    private PasswordEncodeDecode passwordEncodeDecode;

    public FoodRecipeServiceImpl(){

        repository =new FoodRecipeRepositoryImpl();
    }
    @Override
    public void validateAndSave(UserDto dto) {

      AuditDto auditDto = new AuditDto();
        //Date API
        auditDto.setCreatedOn(LocalDateTime.now());
        auditDto.setCreatedBy(dto.getFirstName());
        auditDto.setUserDto(dto);

        String encodedPassword = passwordEncodeDecode.encodePassword(dto.getPassword());
        dto.setPassword(encodedPassword);

        repository.saveUser(auditDto);
        mail.sendMail(dto);

    }

    @Override
    public List<UserDto> getAllUser() {

      return   repository.getAllUser();

    }

    @Override
    public List<UserDto> login(String email, String password) {
        String encryptedPassword = PasswordEncodeDecode.encodePassword(password);

        List<UserDto> list = repository.getEmailAndContactNumberAndPassword(email,encryptedPassword);

        if (list!=null){

            String storedPassword = list.get(0).getPassword();
            System.out.println("Stored password "+storedPassword);
            String decodedPassword = PasswordEncodeDecode.decodePassword(storedPassword);
            System.out.println("Decoded password " + decodedPassword);
            if (password.equals(decodedPassword)){
                System.out.println("login successfully");

            }
            else {
                System.out.println("password not matched");
            }
        }
        return  list;
    }

    @Override
    public UserDto getUser( int userId) {

        return repository.getUser(userId);
    }

    @Override
    public boolean updateUser(int userId, UserDto dto) {

        return repository.updateUser(userId,dto);
    }

    @Override
    public boolean deleteUser(int userId) {
        return repository.deleteUser(userId);
    }

    @Override
    public void saveAndValidateRecipe(RecipeDto recipeDto) {

//          RecipeDto recipe = new RecipeDto();
//          recipe.setRecipeName(recipeDto.getRecipeName());
//          recipe.setRecipeType(recipeDto.getRecipeType());
//          recipe.setQuantity(recipeDto.getQuantity());
//          recipe.setMainIngredients(recipeDto.getMainIngredients());
//         recipe.setIngredientsQuantity(recipeDto.getIngredientsQuantity());
//         recipe.setPublishRecipe(recipeDto.isPublishRe    cipe());
      AuditDto auditDto = new AuditDto();
      UserDto dto = new UserDto();
       auditDto.setCreatedOn(LocalDateTime.now());
       auditDto.setCreatedBy(dto.getFirstName());
       auditDto.setUserDto(dto);

          repository.saveRecipe(recipeDto);
          System.out.println("the recipe successfully saved");

    }

//    @Override
//    public void saveAndValidateIngredient(IngredientDto ingredientDto) {
//
//        repository.saveIngredient(ingredientDto);
//    }




    @Override
    public List<RecipeDto> getAllRecipes() {

        List<RecipeDto> recipeList =  repository.getAllRecipes();
        return recipeList.stream().filter(recipeDto -> recipeDto.isPublishRecipe()==true).collect(Collectors.toList());
    }

    @Override
    public List<RecipeDto> getMyRecipes() {

        List<RecipeDto> myRecipe =repository.getAllRecipes();

        return myRecipe;
    }

    public  boolean checkEmail(String email) {

        System.out.println("checking email in service");
        List<UserDto> list = repository.getAllUser();
        for (UserDto dto : list) {
            if (dto.getEmail().equals(email)) {
                System.out.println("email checked" + email);
                return true;
            }
        }
        return false;
    }
}
