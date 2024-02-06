package com.xworkz.metroapp.dto;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@Entity
@Table
public class TicketBookingDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fromStation;
    private String toStation;
    private int noOfTickets;
    private String paymentOption;

}
