package com.xworkz.mvcapp.service.impl;

import com.xworkz.mvcapp.dto.MvcDto;
import com.xworkz.mvcapp.repository.MvcRepository;
import com.xworkz.mvcapp.repository.impl.MvcRepositoryImpl;
import com.xworkz.mvcapp.service.MvcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MvcServiceImpl implements MvcService {

    @Autowired
     private MvcRepository repository;
    @Override
    public boolean validateAndSaveMvcTechnology(MvcDto dto) {

            repository.save(dto);
            return true;

    }

    @Override
    public List<MvcDto> getAllTechnogies() {

       return repository.getAllTechnogies();
    }

    @Override
    public MvcDto validateAndGetTechnologyById(int id) {

        return repository.getTechnologyById(id);
    }

    @Override
    public boolean validateAndUpdateTechnologyById(MvcDto dto ,int id) {

        return repository.updateTechnologyById(dto ,id);
    }

    @Override
    public boolean validateAndDeleteTechnologyById(int id) {

        return repository.deleteTechnologyById(id);
    }

    @Override
    public List<MvcDto> getMvcByTechnologyNameAndVersion(String mvcTechnologyName, String technologyVersion) {

        return repository.getMvcByTechnologyNameAndVersion(mvcTechnologyName, technologyVersion);
    }
}
