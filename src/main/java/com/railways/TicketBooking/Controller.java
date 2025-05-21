package com.railways.TicketBooking;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/ticket")
public class Controller {
    private List<Passenger> list = new ArrayList<>();

    @PostMapping("/book")
    public String book(@RequestBody Passenger p){
        for(Passenger i : list){
            if(i.getTicketNo().equals(p.getTicketNo())){
                return "Ticket already exists for " + p.getName();
            }
        }
        list.add(p);
        return "Ticket booked for " + p.getName();
    }

    @DeleteMapping("/cancel")
    public String cancel(@RequestBody Passenger p){
        Iterator<Passenger> it = list.iterator();
        while(it.hasNext()){
            if(it.next().getTicketNo().equals(p.getTicketNo())){
                it.remove();
                return "Ticket cancelled for " + p.getName();
            }
        }
        return "No ticket found to cancel for " + p.getName();
    }

    @GetMapping("/view/{ticketNo}")
    public Object view(@PathVariable String ticketNo){
        for(Passenger p : list){
            if(p.getTicketNo().equals(ticketNo)){
                return p;
            }
        }
        return "No ticket found! Please book a ticket";
    }
}