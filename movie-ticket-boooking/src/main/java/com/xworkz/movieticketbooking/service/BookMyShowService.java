package com.xworkz.movieticketbooking.service;

import com.xworkz.movieticketbooking.constants.Languages;
import com.xworkz.movieticketbooking.dto.MovieTicketsDto;

import java.util.List;

public interface BookMyShowService {


    boolean validateMovieTicketsAndSave(MovieTicketsDto movieTickets);

    public  MovieTicketsDto validateAndGetBookingById(int movieId);


    public  boolean validateAndUpdateNoOfTicketsByMovieId(int updatedNoOfTickets ,int movieId);

    public boolean validateAndDeleteBookingById(int movieId);

    public List<MovieTicketsDto> validateAndGetAllBooking();

    public  MovieTicketsDto validateAndGetBookingByName(String  movieName);

    public  List<MovieTicketsDto>  validateAndGetBookingByMovieLanguage(Languages languages);
    public List<MovieTicketsDto> validateAndGetBookingBylocation(String location);
    public MovieTicketsDto validateAndGetBookingByNoOfTickets(int noOfTickets);
    public MovieTicketsDto validateAndGetBookingByTheatreName(String theatreName);
    public MovieTicketsDto validateAndGetBookingByTimings(String timings);
    public  MovieTicketsDto validateAndGetBookingByMoviePrice(double moviePrice);

    public Object[] validateGetTheatreNameByMovieName(String  movieName);

    public  List<String> validateAndGetMovieNameByLocation(String location);

    public  List<Object[]> validateGetMovieNameAndTheatreName(String location);

    void validateAndUpdateMoviePriceByTheatreName(double updatedMoviePrice , String theatreName);

    void validateAndDeleteBookingByMovieId(int movieId);


}
