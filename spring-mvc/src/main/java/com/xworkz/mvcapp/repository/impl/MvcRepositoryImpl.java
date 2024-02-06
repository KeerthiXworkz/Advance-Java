package com.xworkz.mvcapp.repository.impl;

import com.xworkz.mvcapp.dto.MvcDto;
import com.xworkz.mvcapp.repository.MvcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Repository
public class MvcRepositoryImpl implements MvcRepository{

    @Autowired
    private EntityManagerFactory entityManagerFactory;
    @Override
    public boolean save(MvcDto dto) {
        EntityManager em=entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public List<MvcDto> getAllTechnogies() {

        return  entityManagerFactory.createEntityManager().createNamedQuery("getAllTechnogies").getResultList();

    }

    @Override
    public MvcDto getTechnologyById(int id) {

        return (MvcDto) entityManagerFactory.createEntityManager().createNamedQuery("getTechnologyById").setParameter("id",id).getSingleResult();

    }

    @Override
    public boolean updateTechnologyById(MvcDto dto ,int id) {


        EntityManager em=entityManagerFactory.createEntityManager();
        MvcDto dto1 =em.find(MvcDto.class,id);

        if (dto!=null){
            em.getTransaction().begin();
            dto1.setMvcTechnologyName(dto.getMvcTechnologyName());
            dto1.setTechnologyVersion(dto.getTechnologyVersion());
            dto1.setReleasedYear(dto.getReleasedYear());
            dto1.setOwnerName(dto.getOwnerName());
            em.merge(dto1);
            em.getTransaction().commit();
            return true;
        }
        return false;

    }

    @Override
    public boolean deleteTechnologyById(int id) {

        EntityManager em = entityManagerFactory.createEntityManager();
        MvcDto dto = em.find(MvcDto .class,id);
        if (dto != null) {
            em.getTransaction().begin();
            em.remove(dto);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }

    @Override
    public List<MvcDto> getMvcByTechnologyNameAndVersion(String mvcTechnologyName, String technologyVersion) {
       EntityManager em=entityManagerFactory.createEntityManager();
       List<MvcDto> list=em.createNamedQuery("getMvcByTechnologyNameAndVersion").setParameter("tn",mvcTechnologyName).setParameter("tv",technologyVersion).getResultList();

       return list;
    }


}
