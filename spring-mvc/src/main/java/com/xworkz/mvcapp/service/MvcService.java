package com.xworkz.mvcapp.service;

import com.xworkz.mvcapp.dto.MvcDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MvcService {

    boolean validateAndSaveMvcTechnology(MvcDto dto);

    List<MvcDto> getAllTechnogies();

    MvcDto validateAndGetTechnologyById(int id);

    boolean validateAndUpdateTechnologyById(MvcDto dto ,int id);

    boolean validateAndDeleteTechnologyById(int id);

    List<MvcDto> getMvcByTechnologyNameAndVersion(String mvcTechnologyName,String technologyVersion);
}
