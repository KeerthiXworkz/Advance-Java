package com.xworkz.adhardetails.service.impl;

import com.xworkz.adhardetails.dto.AdharaDetailsDto;
import com.xworkz.adhardetails.repository.UserRepository;
import com.xworkz.adhardetails.repository.impl.UserRepositoryImpl;
import com.xworkz.adhardetails.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

UserRepository userRepository;

public  UserServiceImpl(){

    userRepository = new UserRepositoryImpl();
}

    @Override
    public void validateAndSave(AdharaDetailsDto dto) {

        if (dto!=null){
            userRepository.save(dto);

        }
    }

    @Override
    public List<AdharaDetailsDto> validateAndGetAllUsers() {

      return   userRepository.getAllUsers();
    }

    @Override
    public AdharaDetailsDto validateAndGetUserById(int id) {

        AdharaDetailsDto dto=null;
        if(id >0){

            dto = userRepository.getUserById(id);
    }
        return dto;
    }

    @Override
    public boolean validateAndUpdateAdharById(int id, AdharaDetailsDto dto) {

         if (dto!=null){

             userRepository.updateAdharById(id,dto);
             return true;
         }
         return  false;
    }

    @Override
    public boolean validateAndDeleteAdharById(int id) {

    if (id!=0){

        userRepository.deleteAdharById(id);
        return true;
    }

        return false;
    }

}
