package com.xworkz.movieticketbooking.utility;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Manager {

    public static EntityManager createManager() {

        EntityManager em = Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();

        return em;
    }
}
