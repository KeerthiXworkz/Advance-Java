package com.xworkz.movieticketbooking.service.Impl;

import com.xworkz.movieticketbooking.constants.Languages;
import com.xworkz.movieticketbooking.dto.MovieTicketsDto;
import com.xworkz.movieticketbooking.repository.BookMyShowRepository;
import com.xworkz.movieticketbooking.repository.impl.BookMyShowRepositoryImpl;
import com.xworkz.movieticketbooking.service.BookMyShowService;

import java.util.List;

public class BookMyShowServiceImpl implements BookMyShowService {

    //validation

    BookMyShowRepository bookMyShowRepository ;

    public  BookMyShowServiceImpl(){

        bookMyShowRepository = new BookMyShowRepositoryImpl();
    }
    @Override
    public boolean validateMovieTicketsAndSave(MovieTicketsDto movieTickets) {

        System.out.println("invoking the validateMovieTicketsAndSave from service");
          boolean isValidateMovieTicketsAndSave = false;
              boolean isNoOfTicketsValidated = false;
              boolean isLocationValidated = false;
              boolean isMovieNameValidated =false;
              boolean isPriceValidated =false;
              boolean isLanguagesValidated =false;
              boolean isTheatreName = false;
              boolean isTimings =false;

              if(movieTickets.getNoOfTickets() >0){
                  isNoOfTicketsValidated=true;
              }
              if (movieTickets.getLocation() !=null){
                  isLocationValidated =true;
              }
              if (movieTickets.getMovieName() !=null){
                  isMovieNameValidated = true;
              }
              if (movieTickets.getMoviePrice() > 0.0){
                  isPriceValidated = true;
              }
              if (movieTickets.getLanguage() !=null){
                  isLanguagesValidated =true;
              }
              if (movieTickets.getTheatreName() !=null){
                  isTheatreName =true;
              }
              if (movieTickets.getTimings() != null){
                  isTimings =true;
              }
             System.out.println( "validating the all the fields");
              if (isNoOfTicketsValidated ==true && isLocationValidated ==true && isMovieNameValidated ==true
                      && isLanguagesValidated ==true && isTheatreName ==true && isPriceValidated ==true && isTimings == true) {

                  System.out.println("all fields are validated");
                  bookMyShowRepository.save(movieTickets);
                  isValidateMovieTicketsAndSave =true;
              }
              return isValidateMovieTicketsAndSave;
    }

    @Override
    public MovieTicketsDto validateAndGetBookingById(int movieId) {

        System.out.println("invoking of getBookingById by service");
        if (movieId>0){

            System.out.println("get booking by invoking of getBookingById from repository");
            return bookMyShowRepository.getBookingById(movieId);

        }
        return null;
    }

    @Override
    public boolean validateAndUpdateNoOfTicketsByMovieId(int updatedNoOfTickets, int movieId) {
        if (movieId >0){
            System.out.println("updating booking by invoking of updateNoOfTicketsByMovieId from repository");
            return bookMyShowRepository.updateNoOfTicketsByMovieId(updatedNoOfTickets,movieId);
        }


        return false;
    }

    @Override
    public boolean validateAndDeleteBookingById(int movieId) {
        if (movieId >0){

            return bookMyShowRepository.deleteBookingById(movieId);
        }


        return false;
    }

    @Override
    public List<MovieTicketsDto> validateAndGetAllBooking() {

        List<MovieTicketsDto> list = bookMyShowRepository.getAllBooking();
        if (list!=null){
            System.out.println("the  list is not null");
        }

        return list;
    }

    @Override
    public MovieTicketsDto validateAndGetBookingByName(String movieName) {

        MovieTicketsDto dto = bookMyShowRepository.getBookingByMovieName(movieName);
        if (movieName !=null){

            System.out.println("the movieName is not null");
        }

        return dto;
    }

    @Override
    public List<MovieTicketsDto>  validateAndGetBookingByMovieLanguage(Languages languages) {

        List<MovieTicketsDto> list = bookMyShowRepository.getBookingByMovieLanguage(languages);
        if (languages !=null)
            System.out.println("the language not null");
        return list;
    }

    @Override
    public List<MovieTicketsDto> validateAndGetBookingBylocation(String location) {

        List<MovieTicketsDto> list =bookMyShowRepository.getBookingBylocation(location);
        if (location!=null)
            System.out.println("the location is not null");
        return list;
    }

    @Override
    public MovieTicketsDto validateAndGetBookingByNoOfTickets(int noOfTickets) {

        MovieTicketsDto dto = bookMyShowRepository.getBookingByNoOfTickets(noOfTickets);
        if (noOfTickets !=0)
            System.out.println("noOfTickets  are not equal to zero");
        return dto;
    }

    @Override
    public MovieTicketsDto validateAndGetBookingByTheatreName(String theatreName) {

        MovieTicketsDto dto = bookMyShowRepository.getBookingByTheatreName(theatreName);
        if (theatreName!=null){
            System.out.println("theatreName is not null");
        }
        return dto;
    }

    @Override
    public MovieTicketsDto validateAndGetBookingByTimings(String timings) {

        MovieTicketsDto dto = bookMyShowRepository.getBookingByTimings(timings);
        if (timings!=null){
            System.out.println("timings is not null");
        }
        return dto;
    }

    @Override
    public MovieTicketsDto validateAndGetBookingByMoviePrice(double moviePrice) {

        MovieTicketsDto dto = bookMyShowRepository.getBookingByMoviePrice(moviePrice);
        if (moviePrice!=0){
            System.out.println("moviePrice is not equal to zero");
        }
        return dto;
    }

    @Override
    public Object[] validateGetTheatreNameByMovieName(String movieName) {

        Object[] theatreName=(Object[]) bookMyShowRepository.getTheatreNameAndNoOfTicketsByMovieName(movieName);
        if (movieName!=null){
            System.out.println("the movie name is not null");
        }
        return theatreName;
    }

    @Override
    public List<String> validateAndGetMovieNameByLocation(String location) {

        List<String> getMovieName = bookMyShowRepository.getMovieNameByLocation(location);

        if (location != null) {
            System.out.println("the location is not null");

        }
        return getMovieName;
    }

    @Override
    public List<Object[]> validateGetMovieNameAndTheatreName(String location) {

        List<Object[]> getMovieNameAndTheatreName =  bookMyShowRepository.getMovieNameAndTheatreName(location);

        if (location != null) {
            System.out.println("the location is not null");

        }
        return getMovieNameAndTheatreName;
    }

    @Override
    public void validateAndUpdateMoviePriceByTheatreName(double updatedMoviePrice , String theatreName) {

        if (updatedMoviePrice >0.0 && theatreName !=null && !theatreName.isEmpty()){

            bookMyShowRepository.updateMoviePriceByTheatreName(updatedMoviePrice,theatreName);

        }

    }

    @Override
    public void validateAndDeleteBookingByMovieId(int movieId) {

        if(movieId !=0){
            bookMyShowRepository.deleteBookingByMovieId(movieId);
        }
    }
}

