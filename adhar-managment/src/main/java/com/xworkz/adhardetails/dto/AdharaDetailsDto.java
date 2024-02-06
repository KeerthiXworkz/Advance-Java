package com.xworkz.adhardetails.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@ToString

@Table(name = "adhara_details")
@NamedQueries({ @NamedQuery(name = "getAllUsers"  , query = "from AdharaDetailsDto dto"),
               @NamedQuery(name = "getUserId" ,query = "select dto from AdharaDetailsDto dto where id=:id")

})

public class AdharaDetailsDto {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long adharaNumber;
    private int age;
    private long phNo;
    private  String address;
    private String dob;
}
