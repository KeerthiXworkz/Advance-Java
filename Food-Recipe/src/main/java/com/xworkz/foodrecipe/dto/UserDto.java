package com.xworkz.foodrecipe.dto;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Table
@Data
@Entity
@NamedQueries({

        @NamedQuery(name = "getAllUser" ,query = "from UserDto dto"),
        @NamedQuery(name = "getEmailAndContactNumberAndPassword" ,query = "select dto from UserDto dto where dto.email=:email and dto.password=:password"),

})

public class UserDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    @NotNull
    @Size(min = 3 ,max = 15,message = "firstName size should be greater than 3 and less than 15 ")
    private String firstName;
    @Size(min = 1,max = 15 ,message = "lastName size should be greater than 1 and less than 15 ")
    private String lastName;
    @Email(message = "email should be in the format of abc@gamil.com")
    private String email;
    @Size(min = 10 ,max=10,message = "number should be 10")
    private  String contactNumber;
    @Size(min = 10 ,max=10,message = "number should be 10")
    private String alternativeNumber;
    @Size(min = 2 ,max = 20,message = "food type should be greater than 2 and less than 20")
    private String foodType;
    @Size(min =3 ,max = 50 ,message = "address should be more than 3 and less than 50")
    private String Address;
    @Size(min = 6 ,max = 20,message = "password should be greater than 6 and less than 20")
    private String password;


}
