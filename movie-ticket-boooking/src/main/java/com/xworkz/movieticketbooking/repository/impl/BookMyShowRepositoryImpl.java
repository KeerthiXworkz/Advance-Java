package com.xworkz.movieticketbooking.repository.impl;

import com.xworkz.movieticketbooking.constants.Languages;
import com.xworkz.movieticketbooking.repository.BookMyShowRepository;
import com.xworkz.movieticketbooking.dto.MovieTicketsDto;
import com.xworkz.movieticketbooking.utility.Manager;

import javax.persistence.*;
import java.util.List;

public class BookMyShowRepositoryImpl implements BookMyShowRepository {

    //hql is independent of data base
    //hql is object model
    //Mysql is data base model
    // Hql as 3 layers/projection is a object
    @Override
    public void save(MovieTicketsDto dto) {

        System.out.println("invoking the save from repository");
        Persistence persistence = new Persistence();
        EntityManagerFactory emf = persistence.createEntityManagerFactory("com.xworkz");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(dto);  // for adding the data
        em.getTransaction().commit();
        em.close();
        emf.close();

        //em.remove(dto);  //for delete data
        //em.merge(); //for updating data
        //em.find();  //for getting the data

    }

    @Override
    public List<MovieTicketsDto> getAllBooking() {

//        EntityManager em= new Persistence().createEntityManagerFactory("com.xworkz").createEntityManager();

        EntityManager em = Manager.createManager();
        Query q = em.createNamedQuery("getAllBooking");

        return q.getResultList();
    }

    @Override
    public MovieTicketsDto getBookingById(int movieId) {

//        Persistence persistence = new Persistence();
//        EntityManagerFactorySingleton emf = persistence.createEntityManagerFactory("com.xworkz");
//        EntityManager em = emf.createEntityManager();
//
//        MovieTicketsDto movieTicket =em.find(MovieTicketsDto.class,movieId);
//        return movieTicket;
        System.out.println("invoking the getBookingById from repository");
        return new Persistence().createEntityManagerFactory("com.xworkz").createEntityManager().find(MovieTicketsDto.class, movieId);
    }

    @Override
    public boolean updateNoOfTicketsByMovieId(int updatedNoOfTickets, int movieId) {

        boolean isUpdatedNoOfTickets = false;

        EntityManager em = new Persistence().createEntityManagerFactory("com.xworkz").createEntityManager();
        MovieTicketsDto dto = em.find(MovieTicketsDto.class, movieId);

        if (dto != null) {
            System.out.println(dto);
            dto.setNoOfTickets(updatedNoOfTickets);
            em.getTransaction().begin();
            em.merge(dto);
            em.getTransaction().commit();
            isUpdatedNoOfTickets = true;

        }

        return isUpdatedNoOfTickets;
    }

    @Override
    public boolean deleteBookingById(int movieId) {

        boolean isBookingDelted = false;
        EntityManager em = Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
        MovieTicketsDto dto = em.find(MovieTicketsDto.class, movieId);
        if (dto != null) {

            em.getTransaction().begin();
            em.remove(dto);
            em.getTransaction().commit();
            isBookingDelted = true;

        } // Masking - hiding the data it shows the special characters
        //      Good knowledge on MVC pattern
        return isBookingDelted;
    }

    @Override
    public MovieTicketsDto getBookingByMovieName(String movieName) {

        return (MovieTicketsDto) Manager.createManager().createNamedQuery("getBookingByMovieName").setParameter("mn",movieName).getSingleResult();

    }

    @Override
    public List<MovieTicketsDto> getBookingByMovieLanguage(Languages languages) {

        EntityManager em = Manager.createManager();
//        Query q = em.createQuery("select dto from MovieTicketsDto as dto where dto.language='" + languages + "'");
        Query q= em.createNamedQuery("getBookingByMovieLanguage").setParameter("lang",languages);

        return q.getResultList();
    }

    @Override
    public List<MovieTicketsDto> getBookingBylocation(String location) {

        EntityManager em = Manager.createManager();
        Query query = em.createNamedQuery("getBookingBylocation").setParameter("loc",location); //setParameter work like a map

        return query.getResultList();
    }

    @Override
    public MovieTicketsDto getBookingByNoOfTickets(int noOfTickets) {

        EntityManager em = Manager.createManager();
        Query query = em.createNamedQuery("getBookingByNoOfTickets").setParameter("nt",noOfTickets);
        MovieTicketsDto dto = (MovieTicketsDto) query.getSingleResult();

        return dto;
    }

    @Override
    public MovieTicketsDto getBookingByTheatreName(String theatreName) {

        EntityManager em = Manager.createManager();
        Query query = em.createQuery("getBookingByTheatreName").setParameter("tn",theatreName);
        MovieTicketsDto dto = (MovieTicketsDto) query.getSingleResult();
        return dto;

    }

    @Override
    public MovieTicketsDto getBookingByTimings(String timings) {

       EntityManager em= Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
        Query query = em.createQuery("select dto from MovieTicketsDto  dto where timings='"+timings+"' ");

        MovieTicketsDto dto = (MovieTicketsDto) query.getSingleResult();
        return dto;
    }

    @Override
    public MovieTicketsDto getBookingByMoviePrice(double moviePrice) {

        EntityManager em = Manager.createManager();
        Query query = em.createNamedQuery("getBookingByMoviePrice").setParameter("mp",moviePrice);
        MovieTicketsDto dto = (MovieTicketsDto) query.getSingleResult();

        return dto;
    }

    @Override
    public Object[] getTheatreNameAndNoOfTicketsByMovieName(String movieName) {
        EntityManager em = Manager.createManager();
        Query query = em.createNamedQuery("getTheatreNameAndNoOfTicketsByMovieName").setParameter("mn1",movieName);
        Object[] theatreName = (Object[]) query.getSingleResult();
        return theatreName;
    }

    @Override
    public List<String> getMovieNameByLocation(String location) {

        return Manager.createManager().createNamedQuery("getMovieNameByLocation").setParameter("loc1",location).getResultList();

    }

    @Override
    public List<Object[]> getMovieNameAndTheatreName(String location) {

        return Manager.createManager().createNamedQuery("getMovieNameAndTheatreName").setParameter("loc2",location).getResultList();

    }

    @Override
    public void updateMoviePriceByTheatreName(double updatedMoviePrice, String theatreName) {

        EntityManager em = Manager.createManager();
        em.getTransaction().begin();
        Query query = em.createNamedQuery("updateMoviePriceByTheatreName").setParameter("mp",updatedMoviePrice).setParameter("tn1",theatreName);
        query.executeUpdate();

        em.getTransaction().commit();
    }

    @Override
    public void deleteBookingByMovieId(int movieId) {

        EntityManager em  = Manager.createManager();
        em.getTransaction().begin();
        Query query = em.createNamedQuery("deleteBookingByMovieId").setParameter("mi",movieId);
        query.executeUpdate();
        em.getTransaction().commit();

    }

}
