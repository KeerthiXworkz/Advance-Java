package com.xworkz.metroapp.service.impl;

import com.xworkz.metroapp.dto.TicketBookingDto;
import com.xworkz.metroapp.dto.UserDto;
import com.xworkz.metroapp.repository.MetroRepository;
import com.xworkz.metroapp.repository.impl.MetroRepositoryImpl;
import com.xworkz.metroapp.service.MetroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MetroServiceImpl implements MetroService {

    @Autowired
    public MetroRepository repository;

//    public MetroServiceImpl(){
//
//        repository = new MetroRepositoryImpl();
//    }
    @Override
    public void validateAndSaveUser(UserDto dto) {

        repository.saveUser(dto);
    }

    @Override
    public boolean validateAndSaveBooking(TicketBookingDto dto) {

        if (dto != null) {
            repository.saveBooking(dto);
            return true;
        }
        return false;

    }

    @Override
    public List<UserDto> validateAndGetAllUsers() {

        return repository.getAllUser();
    }

    @Override
    public List<UserDto> getUser(String userName, String email, long phone) {

        return repository.getUser(userName,email,phone);
    }
}
