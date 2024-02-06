package com.xworkz.metroapp.dto;

import lombok.Data;
import lombok.ToString;


import javax.persistence.*;

@Entity
@Data
@ToString
@Table

@NamedQueries({
        @NamedQuery(name = "getAllUser" ,query = "from UserDto dto"),
        @NamedQuery(name = "getUser" ,query = "select dto from UserDto dto where dto.userName=:userName or dto.email=:email or dto.phone=:phone")
})

public class UserDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String userName;
    private String email;
    private Long phone;
    private String address;
    private String password;

}
