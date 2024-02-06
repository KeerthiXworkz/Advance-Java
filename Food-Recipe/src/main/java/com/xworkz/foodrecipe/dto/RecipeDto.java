package com.xworkz.foodrecipe.dto;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
@Entity
@Table
@NamedQueries({
        @NamedQuery(name = "getAllRecipe",query = "from RecipeDto dto")
})

public class RecipeDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recipeId;
    @NotNull
    @Size(min = 3 ,max = 20,message = "recipe name should be more then 3 and less than 20")
    private String recipeName;
    @Size(min = 2 ,max = 20,message = "recipe name should be more then 2 and less than 20")
    private String recipeType;
    @Size(min = 1 ,max = 1000,message = "recipe name should be more then 1 and less than 1000")
    private String quantity;

    private String mainIngredient1;
    private String ingredientQuantity1;
    private String mainIngredient2;
    private String ingredientQuantity2;
    private String mainIngredient3;
    private String ingredientQuantity3;
    private String mainIngredient4;
    private String ingredientQuantity4;
    private String mainIngredient5;
    private String ingredientQuantity5;

    private boolean publishRecipe;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private UserDto userDto;

}
