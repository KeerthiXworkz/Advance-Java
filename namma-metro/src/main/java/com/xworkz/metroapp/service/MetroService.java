package com.xworkz.metroapp.service;

import com.xworkz.metroapp.dto.TicketBookingDto;
import com.xworkz.metroapp.dto.UserDto;

import java.util.List;

public interface MetroService {

    public void validateAndSaveUser(UserDto dto);

    public boolean validateAndSaveBooking(TicketBookingDto dto);

    List<UserDto> validateAndGetAllUsers();

    List<UserDto> getUser(String userName,String email,long phone);
}
