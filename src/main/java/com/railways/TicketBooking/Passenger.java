package com.railways.TicketBooking;

public class Passenger {
    private String name;
    private String ticketNo;

    public Passenger(){}

    public Passenger(String name, String ticketNo){
        this.name = name;
        this.ticketNo = ticketNo;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getTicketNo(){
        return ticketNo;
    }

    public void setTicketNo(String ticketNo){
        this.ticketNo = ticketNo;
    }
}