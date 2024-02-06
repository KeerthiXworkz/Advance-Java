package com.xworkz.adhardetails.repository;

import com.xworkz.adhardetails.dto.AdharaDetailsDto;

import java.util.List;

public interface UserRepository {

    public void save(AdharaDetailsDto dto);

    List<AdharaDetailsDto> getAllUsers();

    AdharaDetailsDto getUserById(int id);

    boolean updateAdharById(int id, AdharaDetailsDto dto);

    boolean deleteAdharById(int id);
}
