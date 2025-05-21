package com.project.ParkingLot;

import java.time.LocalTime;

public class Vehicle {
    private String vehicleNo;
    private LocalTime entryTime;
    private LocalTime exitTime;

    public Vehicle(){}

    public Vehicle(String vehicleNo){
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleNo(){
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo){
        this.vehicleNo = vehicleNo;
    }

    public LocalTime getEntryTime(){
        return entryTime;
    }

    public void setEntryTime(LocalTime entryTime){
        this.entryTime = entryTime;
    }

    public LocalTime getExitTime(){
        return exitTime;
    }

    public void setExitTime(LocalTime exitTime){
        this.exitTime = exitTime;
    }
}