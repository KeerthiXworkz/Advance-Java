package com.xworkz.metroapp.repository.impl;

import com.xworkz.metroapp.dto.TicketBookingDto;
import com.xworkz.metroapp.dto.UserDto;
import com.xworkz.metroapp.repository.MetroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Component
public class MetroRepositoryImpl implements MetroRepository {

    @Autowired
    private EntityManagerFactory emf;
    @Override
    public void saveUser(UserDto dto) {
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
    }

    @Override
    public boolean saveBooking(TicketBookingDto bookingDto) {

        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(bookingDto);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public List<UserDto> getAllUser() {

        return emf.createEntityManager().createNamedQuery("getAllUser").getResultList();
    }

    @Override
    public List<UserDto> getUser(String userName, String email, long phone) {

        EntityManager em=emf.createEntityManager();
        List<UserDto> list=em.createNamedQuery("getUser").setParameter("userName",userName).setParameter("email",email).setParameter("phone",phone).getResultList();
        return list;
    }

}
