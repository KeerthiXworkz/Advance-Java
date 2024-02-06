package com.xworkz.movieticketbooking.dto;

import com.xworkz.movieticketbooking.constants.Languages;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity //we can map class data to database table data (which provides the eligibilty to mapping)


@Table(name = "movies_tickets")

@NamedQueries({@NamedQuery(name = "getAllBooking",query = "from MovieTicketsDto ") ,
              @NamedQuery(name ="getBookingByMovieName",query = "from MovieTicketsDto  dto where dto.movieName=:mn "), // =: named parameter
              @NamedQuery(name = "getBookingByMovieLanguage",query = "select dto from MovieTicketsDto as dto where dto.language=:lang"),
              @NamedQuery(name = "getBookingBylocation" ,query = "select dto from MovieTicketsDto dto where dto.location =:loc"),
              @NamedQuery(name = "getBookingByNoOfTickets" ,query = "select dto from MovieTicketsDto as dto where noOfTickets=:nt"),
              @NamedQuery(name = "getBookingByTheatreName",query = "select dto from MovieTicketsDto as dto where dto.theatreName =:tn"),
              @NamedQuery(name = "getBookingByMoviePrice" ,query = " select dto from MovieTicketsDto as dto where moviePrice=: mp"),
              @NamedQuery(name = "getTheatreNameAndNoOfTicketsByMovieName" ,query = "select dto.theatreName,dto.noOfTickets  from MovieTicketsDto dto where dto.movieName=:mn1"),
              @NamedQuery(name = "getMovieNameByLocation" ,query = "select dto.movieName from MovieTicketsDto dto where dto.location =: loc1"),
              @NamedQuery(name = "getMovieNameAndTheatreName" ,query = "select dto.movieName,dto.theatreName from MovieTicketsDto dto where dto.location =: loc2"),
              @NamedQuery(name = "updateMoviePriceByTheatreName" ,query = "update MovieTicketsDto dto set dto.moviePrice=:mp where dto.theatreName=:tn1 "),
              @NamedQuery(name = "deleteBookingByMovieId" ,query = "delete from MovieTicketsDto dto where dto.movieId=:mi")})//consolidate all my hql query in one place


public class MovieTicketsDto {

@Id
@Column(name="movie_id")
//@GenericGenerator(name = "ref" ,strategy = "increment")
//@GeneratedValue(generator = "ref")
@GeneratedValue(strategy = GenerationType.IDENTITY)//another type to increment the id
 private  int movieId;

 @Column(name = "movie_name")
 private String movieName;

 @Column(name= "language")
 @Enumerated(EnumType.STRING)
 private Languages language;

 @Column(name="location")
 private String location;

 @Column(name="movie_price")
 private double moviePrice;

 @Column(name="theatre")
 private String theatreName;

 @Column(name="timings")
 private String timings;

 @Column(name="no_of_tickets")
 private int noOfTickets;

}
