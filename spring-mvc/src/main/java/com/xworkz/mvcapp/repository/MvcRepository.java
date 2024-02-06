package com.xworkz.mvcapp.repository;

import com.xworkz.mvcapp.dto.MvcDto;

import java.util.List;


public interface MvcRepository {

  boolean save(MvcDto dto);

  List<MvcDto> getAllTechnogies();

  MvcDto getTechnologyById(int id);

  boolean updateTechnologyById(MvcDto dto,int id);

  boolean deleteTechnologyById( int id);

  List<MvcDto> getMvcByTechnologyNameAndVersion(String mvcTechnologyName,String technologyVersion);
}
