package com.xworkz.metroapp.repository;


import com.xworkz.metroapp.dto.TicketBookingDto;
import com.xworkz.metroapp.dto.UserDto;

import java.util.List;

public interface MetroRepository {

  public  void saveUser(UserDto dto);
  public boolean saveBooking(TicketBookingDto dto);

  List<UserDto> getAllUser();

  List<UserDto> getUser(String userName ,String email,long phone);


}
