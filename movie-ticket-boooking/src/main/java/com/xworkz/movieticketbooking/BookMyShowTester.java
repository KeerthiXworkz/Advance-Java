package com.xworkz.movieticketbooking;

import com.xworkz.movieticketbooking.constants.Languages;
import com.xworkz.movieticketbooking.dto.MovieTicketsDto;
import com.xworkz.movieticketbooking.service.BookMyShowService;
import com.xworkz.movieticketbooking.service.Impl.BookMyShowServiceImpl;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BookMyShowTester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookMyShowService bookMyShow = new BookMyShowServiceImpl() ;
//        System.out.println("enter the size of the booking");
//
          /*  System.out.println("enter location,theatreName,movieName,langauge,noOfTickets,moviePrice,timings");
            MovieTicketsDto movie = MovieTicketsDto.builder().

                    location(sc.next()).
                    theatreName(sc.next()).
                    movieName(sc.next()).
                    language(Languages.valueOf(sc.next())).
                    noOfTickets(sc.nextInt()).
                    moviePrice(sc.nextDouble()).
                    timings(sc.next()).
                    build();

            bookMyShow.validateMovieTicketsAndSave(movie);*/
//
//        System.out.println("enter the movie id to get booking details");
//        MovieTicketsDto movieTicketsDto = bookMyShow.validateAndGetBookingById(sc.nextInt());
//        System.out.println(movieTicketsDto);

//        System.out.println("enter the no of tickets and movie id to update the  no of tickets");
//        boolean isTicketsUpdated = bookMyShow.validateAndUpdateNoOfTicketsByMovieId(sc.nextInt(), sc.nextInt());
//        System.out.println(isTicketsUpdated);

//        System.out.println("enter the movie id to delete the movie tickets");
//            boolean isTicktesDeleted = bookMyShow.validateAndDeleteBookingById(sc.nextInt());
//        System.out.println(isTicktesDeleted);

        for ( MovieTicketsDto list :bookMyShow.validateAndGetAllBooking()) {
            System.out.println(list);
        }
//        System.out.println("enter the mpovie Name to get booking");
//        MovieTicketsDto dto = bookMyShow.validateAndGetBookingByName(sc.next());
//        System.out.println(dto);
//
//        System.out.println("enter the Language to get booking ");
//        List<MovieTicketsDto> list1= bookMyShow.validateAndGetBookingByMovieLanguage(Languages.valueOf(sc.next()));
//        System.out.println(list1);

//        System.out.println("enter the location to get booking");
//        List<MovieTicketsDto> list = bookMyShow.validateAndGetBookingBylocation(sc.next());
//        System.out.println(list);

//        System.out.println("enter the theatre name to get booking");
//        MovieTicketsDto dto2 = bookMyShow.validateAndGetBookingByTheatreName(sc.next());
//        System.out.println(dto2);

//        System.out.println("enter the noOfTickets to get booking");
//        MovieTicketsDto dto3=bookMyShow.validateAndGetBookingByNoOfTickets(sc.nextInt());
//        System.out.println(dto3);

//        System.out.println("enter the timings to get booking");
//        MovieTicketsDto dto4 = bookMyShow.validateAndGetBookingByTimings(sc.next());
//        System.out.println(dto4);

//        System.out.println("enter the moviePrice to get booking");
//        MovieTicketsDto dto5= bookMyShow.validateAndGetBookingByMoviePrice(sc.nextDouble());
//        System.out.println(dto5);

//
//        System.out.println("entre the movie name to get theatre name");
//        for ( Object getMovieName : bookMyShow.validateGetTheatreNameByMovieName(sc.next())) {
//
//        System.out.println(getMovieName);
//        }
//
//        System.out.println("enter the location to get movie name");
//        List<String> getMovieName =bookMyShow.validateAndGetMovieNameByLocation(sc.next());
//        System.out.println(getMovieName);

//
//         System.out.println("enter the location to get movieName and theatre name");
//        for ( Object[] getMovieNameAndTheatreName :  bookMyShow.validateGetMovieNameAndTheatreName(sc.next())){
//
//            System.out.println(Arrays.toString(getMovieNameAndTheatreName));
//        }

        System.out.println("enter updated movie price and theatre name to update movie price");
        bookMyShow.validateAndUpdateMoviePriceByTheatreName(sc.nextDouble(),sc.next());
//
//        System.out.println("enter movie id to delete booking");
//        bookMyShow.validateAndDeleteBookingByMovieId(sc.nextInt());
        }
    }

