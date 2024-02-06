package com.xworkz.foodrecipe.controller;

import com.xworkz.foodrecipe.dto.RecipeDto;
import com.xworkz.foodrecipe.dto.UserDto;
import com.xworkz.foodrecipe.service.FoodRecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class FoodRecipeController {

    @Autowired
    public FoodRecipeService service;

    @PostMapping("register")
   public String saveUser(@ModelAttribute @Valid  UserDto dto , BindingResult errors, Model model) {

if (errors.hasErrors()){

    System.out.println("is dto has errors: " + errors.hasErrors());
    List<ObjectError> errorList=errors.getAllErrors();
    for (ObjectError objectError :errorList){
        System.out.println(objectError.getDefaultMessage());
    }
    model.addAttribute("listError", errorList);
    return "index";
}
    if (dto != null) {

        service.validateAndSave(dto);

        return "index";
    }
    return "error";
}

@GetMapping("getAllUser")
public String getAll(Model model){

        List<UserDto> list= service.getAllUser();

            model.addAttribute("userList" ,list);
         System.out.println(list);
         return "";
        }

        @GetMapping("getUserDetails")
        public String getUserDetails(@RequestParam("userId") int userId ,Model model){

        UserDto userDto=service.getUser(userId);
        model.addAttribute("userProfile",userDto);
        System.out.println(userDto);

        return "user-list";

        }

        @PostMapping("login")
        public String userLogin(@RequestParam String email,@RequestParam String password,Model model){

            UserDto dto=service.login(email,password).get(0);
             if (dto!=null){

              model.addAttribute("userName",dto);
              System.out.println(dto);

              return getAllRecipes(model);
          }

       return  "error";
        }

    @GetMapping("getUser")
    public String getUser(@RequestParam("userId") int userId ,Model model){

        UserDto userDto=service.getUser(userId);
        model.addAttribute("editUser",userDto);
        System.out.println(userDto);

        return "update-user";

    }

        @PostMapping("updateUser")
        public String update(@ModelAttribute UserDto dto ,int userId ,Model model){

        if (service.updateUser(userId ,dto)) {

            model.addAttribute("updateMessage","updatedSuccessfully");

            return  getUserDetails(userId,model);
        }
    return "error";
        }


        @GetMapping("delete")
        public String delete(@RequestParam("userId") int userId ,Model model ){

        if (service.deleteUser(userId)){
            model.addAttribute("deleteMessage" ,"deletedSuccessfully");
            return getUserDetails(userId,model);
        }
        return "error";
        }

        @PostMapping("recipeForm")
        public String saveRecipe(@ModelAttribute @Valid RecipeDto recipeDto, BindingResult error, Model model){
            System.out.println("dto:"+recipeDto);
        if (error.hasErrors()){

            System.out.println("is recipe dto has error:" + error.hasErrors());
            List<ObjectError> errorList = error.getAllErrors();
            for (ObjectError objectError: errorList){
                System.out.println(objectError.getDefaultMessage());
            }
            model.addAttribute("listOfError ",errorList);

            return "user-profile";
        }
            // Save the recipe
            service.saveAndValidateRecipe(recipeDto);
            model.addAttribute("addRecipe",recipeDto);
            System.out.println(recipeDto);
            return "user-profile";
        }


        @GetMapping("getUserById")
        public String getUserById(@RequestParam("userId") int userId,Model model){

        UserDto dto1 = service.getUser(userId);
        model.addAttribute("userId",dto1);

        return "user-profile";
        }

        @GetMapping("myRecipe")
    public String getMyRecipes(Model model){

        List<RecipeDto> list = service.getMyRecipes();
            System.out.println(list);
        model.addAttribute("recipeList",list);

        return "foodrecipe-list";

        }

        public String getAllRecipes(Model model){

        List<RecipeDto> list =service.getAllRecipes();
            System.out.println(list);
            model.addAttribute("recipeList",list);

            return "dashboard";
        }

}

