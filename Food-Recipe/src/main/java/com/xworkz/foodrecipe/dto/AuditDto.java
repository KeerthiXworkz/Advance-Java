package com.xworkz.foodrecipe.dto;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table

public class AuditDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private int auditId;
private  String createdBy;
private LocalDateTime createdOn;
private String updatedBy;
private LocalDateTime updatedOn;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private UserDto userDto;


}
