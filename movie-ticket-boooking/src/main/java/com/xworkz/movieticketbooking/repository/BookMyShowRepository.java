package com.xworkz.movieticketbooking.repository;

import com.xworkz.movieticketbooking.constants.Languages;
import com.xworkz.movieticketbooking.dto.MovieTicketsDto;

import java.util.List;

public interface BookMyShowRepository {

    public  void save(MovieTicketsDto dto);

  public List<MovieTicketsDto> getAllBooking();
    public  MovieTicketsDto getBookingById(int movieId);

    public  boolean updateNoOfTicketsByMovieId(int updatedNoOfTickets ,int movieId);

    public boolean deleteBookingById(int movieId);

    public MovieTicketsDto getBookingByMovieName(String movieName);

    public List<MovieTicketsDto>  getBookingByMovieLanguage(Languages languages);
    public List<MovieTicketsDto> getBookingBylocation(String location);
    public MovieTicketsDto getBookingByNoOfTickets(int noOfTickets);
    public MovieTicketsDto getBookingByTheatreName(String theatreName);
    public MovieTicketsDto getBookingByTimings(String timings);
    public  MovieTicketsDto getBookingByMoviePrice(double moviePrice);

  public Object[] getTheatreNameAndNoOfTicketsByMovieName(String  movieName);

  public List<String> getMovieNameByLocation(String location);

  public  List<Object[]> getMovieNameAndTheatreName(String location);


  void updateMoviePriceByTheatreName(double updatedMoviePrice, String theatreName);

  void deleteBookingByMovieId(int movieId);
}
