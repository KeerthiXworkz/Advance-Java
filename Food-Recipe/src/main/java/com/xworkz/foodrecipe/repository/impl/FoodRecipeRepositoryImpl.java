package com.xworkz.foodrecipe.repository.impl;

import com.xworkz.foodrecipe.dto.AuditDto;
import com.xworkz.foodrecipe.dto.RecipeDto;
import com.xworkz.foodrecipe.dto.UserDto;
import com.xworkz.foodrecipe.repository.FoodRecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Component
public class FoodRecipeRepositoryImpl implements FoodRecipeRepository{

    @Autowired
    public EntityManagerFactory emf;

    @Override
    public boolean saveUser(AuditDto dto) {

        boolean isNewUser=false;

        EntityManager em= emf.createEntityManager();
        em.getTransaction().begin();
        System.out.println(dto);
        em.persist(dto);
        isNewUser=true;
        em.getTransaction().commit();

        return isNewUser;
    }

    @Override
    public List<UserDto> getAllUser() {

        EntityManager em= emf.createEntityManager();
        List<UserDto> list=em.createNamedQuery("getAllUser").getResultList();
        return list;
    }

    @Override
    public List<UserDto> getEmailAndContactNumberAndPassword(String email, String password) {

        EntityManager em=emf.createEntityManager();
        List<UserDto> list= em.createNamedQuery("getEmailAndContactNumberAndPassword").setParameter("email",email).setParameter("password",password).getResultList();

        return list;
    }

    @Override
    public UserDto getUser(int userId) {
        EntityManager entityManager =emf.createEntityManager();

        return entityManager.find(UserDto.class,userId);
    }

    @Override
    public boolean updateUser(int userId, UserDto dto) {

        EntityManager em = emf.createEntityManager();
        UserDto dto1 = emf.createEntityManager().find(UserDto.class, userId);

        if (dto != null) {
            em.getTransaction().begin();
            dto1.setFirstName(dto.getFirstName());
            dto1.setLastName(dto.getLastName());
            dto1.setEmail(dto.getEmail());
            dto1.setAddress(dto.getAddress());
            dto1.setEmail(dto.getEmail());
            dto1.setFoodType(dto.getFoodType());
            dto1.setContactNumber(dto.getContactNumber());
            dto1.setAlternativeNumber(dto.getAlternativeNumber());
            dto1.setPassword(dto.getPassword());
            em.merge(dto1);
            em.getTransaction().commit();


        }
        return true;
    }
    public boolean deleteUser(int uerId){

    EntityManager em= emf.createEntityManager();
    UserDto dto=em.find(UserDto.class,uerId);
    em.getTransaction().begin();
    em.remove(dto);
    em.getTransaction().commit();
    return true;

    }

    @Override
    public void saveRecipe(RecipeDto recipeDto) {

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        System.out.println(recipeDto);
        em.persist(recipeDto);
        em.getTransaction().commit();

    }

//    @Override
//    public void saveIngredient(IngredientDto ingredientDto) {
//
//        EntityManager entityManager =emf.createEntityManager();
//        entityManager.getTransaction().begin();
//        entityManager.persist(ingredientDto);
//        entityManager.getTransaction().commit();
//    }

    @Override
    public List<RecipeDto> getAllRecipes() {

        EntityManager em = emf.createEntityManager();
        List<RecipeDto> list=em.createNamedQuery("getAllRecipe").getResultList();
        return list;
    }
    @Override
    public boolean updateRecipe(RecipeDto recipeDto, int recipeId) {
        return false;
    }


}




