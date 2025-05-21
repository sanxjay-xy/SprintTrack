package com.reservation.hostel;

public class Room {
    private int number;
    private String type;
    private boolean isFree = true;

    public Room(){}

    public Room(int number, String type){
        this.number = number;
        this.type = type;
    }

    public int getNumber(){
        return number;
    }

    public String getType(){
        return type;
    }

    public boolean isFree(){
        return isFree;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setFree(boolean free){
        isFree = free;
    }
}