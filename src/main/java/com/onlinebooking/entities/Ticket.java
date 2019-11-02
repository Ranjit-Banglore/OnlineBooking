package com.onlinebooking.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ticket_details")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private  Integer ticketId;

    @Column(name = "passenger_name", nullable = false)
    private String passengerName;

    @Column(name = "booking_date", nullable = false)
    private String bookingDate;

    @Column(name = "source_station", nullable = false)
    private String sourceStation;

    @Column(name = "dest_station", nullable = false)
    private String destStation;

    @Column(name = "email", unique = true)
    private String email;

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getSourceStation() {
        return sourceStation;
    }

    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }

    public String getDestStation() {
        return destStation;
    }

    public void setDestStation(String destStation) {
        this.destStation = destStation;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Ticket [ticketId=" + ticketId + ", passengerName=" + passengerName + ", bookingDate=" + bookingDate
                + ", sourceStation=" + sourceStation + ", destStation=" + destStation + ", email=" + email + "]";
    }
}
