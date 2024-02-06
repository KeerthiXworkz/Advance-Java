package com.xworkz.mvcapp.dto;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
@ToString
@Entity
@Table
@NamedQueries({
        @NamedQuery(name = "getAllTechnogies" ,query = "from MvcDto dto"),
        @NamedQuery(name = "getTechnologyById" ,query = "select dto from MvcDto dto where dto.id=:id"),
        @NamedQuery(name = "getMvcByTechnologyNameAndVersion" ,query = "select dto from MvcDto dto where dto.mvcTechnologyName=:tn or dto.technologyVersion=:tv")
        //"select dto from Mvcdto dto where firstName=:fn or email =:email"
})
public class MvcDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
     @NotNull(message = "name should not be null")
     @Size(max=9 ,min=3 ,message = "name should be greater than 3 less than 9")
    private String mvcTechnologyName;

     @Size(max=5 ,min=2,message = "version should be greater than 2 less than 5")
    private String technologyVersion;

     @Size(max=4 ,min=1 ,message = "year should be greater than 1 less than 4")
    private String releasedYear;

     @Size(max=10 ,min=3 ,message = "ownerName should be greater than 3 less than 10")
     private  String ownerName;
}
