package com.xworkz.adhardetails.repository.impl;

import com.xworkz.adhardetails.dto.AdharaDetailsDto;
import com.xworkz.adhardetails.emfsingleton.EntityManagerFactorySingleton;
import com.xworkz.adhardetails.repository.UserRepository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {


    @Override
    public void save(AdharaDetailsDto dto) {

        EntityManager em= EntityManagerFactorySingleton.getFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
    }

    @Override
    public List<AdharaDetailsDto> getAllUsers() {

        EntityManager em=EntityManagerFactorySingleton.getFactory().createEntityManager();
        Query query = em.createNamedQuery("getAllUsers");

        return query.getResultList();
    }

    @Override
    public AdharaDetailsDto getUserById(int id) {
        EntityManager em=EntityManagerFactorySingleton.getFactory().createEntityManager();

        return (AdharaDetailsDto) em.createNamedQuery("getUserId").setParameter("id",id).getSingleResult();
    }

    @Override
    public boolean updateAdharById(int id, AdharaDetailsDto dto) {

        EntityManager em = EntityManagerFactorySingleton.getFactory().createEntityManager();
        AdharaDetailsDto dto1 =em.find(AdharaDetailsDto.class,id);

        if (dto1!=null ){

            em.getTransaction().begin();
            dto1.setName(dto.getName());
            dto1.setAdharaNumber(dto.getAdharaNumber());
            dto1.setPhNo(dto.getPhNo());
            dto1.setAge(dto.getAge());
            dto1.setAddress(dto.getAddress());
            dto1.setDob(dto.getDob());
            em.merge(dto1);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteAdharById(int id) {

        EntityManager em = EntityManagerFactorySingleton.getFactory().createEntityManager();
        AdharaDetailsDto dto =em.find(AdharaDetailsDto.class,id);

        if (dto!=null){

            em.getTransaction().begin();
            em.remove(dto);
            em.getTransaction().commit();
            return true;
        }

        return false;
    }

}
