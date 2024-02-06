package com.xworkz.movieticketbooking;

import com.xworkz.movieticketbooking.utility.EntityManagerFactorySingleton;

import javax.persistence.EntityManagerFactory;

public class Executor {

    public static void main(String[] args) {

//       EntityManager em = Manager.createManager();
//        System.out.println(em);
//
//
//        EntityManager em1=Manager.createManager();
//        System.out.println(em1);

        EntityManagerFactory emf = EntityManagerFactorySingleton.getFactory();
        System.out.println(emf);

        EntityManagerFactory emf1 = EntityManagerFactorySingleton.getFactory();
        System.out.println(emf1);

    }
}
