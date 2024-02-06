package com.xworkz.adhardetails.service;

import com.xworkz.adhardetails.dto.AdharaDetailsDto;

import java.util.List;

public interface UserService {

    public void validateAndSave(AdharaDetailsDto dto);

    List<AdharaDetailsDto> validateAndGetAllUsers();

    AdharaDetailsDto validateAndGetUserById(int id);
     boolean validateAndUpdateAdharById(int id,AdharaDetailsDto dto);

     boolean validateAndDeleteAdharById(int id);

}
