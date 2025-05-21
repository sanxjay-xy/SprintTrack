package com.reservation.hostel;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/hostel")
public class Controller {
    private List<Student> list = new ArrayList<>();
    private List<Room> roomList = new ArrayList<>();

    public Controller(){
        roomList.add(new Room(1, "Single"));
        roomList.add(new Room(2, "Single"));
        roomList.add(new Room(3, "Double"));
    }

    @PostMapping("/register")
    public String register(@RequestBody Student s){
        list.add(s);
        for(Room r : roomList){
            if(r.isFree() && r.getType().equalsIgnoreCase(s.getPreference())){
                r.setFree(false);
                s.setRoomNo(r.getNumber());
                return "Room " + r.getNumber() + " assigned to " + s.getName();
            }
        }
        return "Preferred Room not available";
    }

    @GetMapping("/students")
    public List<Student> getAll(){
        return list;
    }

    @PostMapping("/checkout/{num}")
    public String checkout(@PathVariable int num){
        for(Room r : roomList){
            if(r.getNumber() == num && !r.isFree()){
                Iterator<Student> it = list.iterator();
                while(it.hasNext()){
                    Student s = it.next();
                    if(s.getRoomNo() == num){
                        it.remove();
                        r.setFree(true);
                        return "Checked out from room " + num;
                    }
                }
            }
        }
        return "Couldn't check out";
    }

    @GetMapping("/rooms")
    public List<Room> showRooms(){
        return roomList;
    }
}