package com.project.ParkingLot;

import org.springframework.web.bind.annotation.*;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@RestController
@RequestMapping("/parking")
public class Controller {
    private List<Vehicle> lot = new ArrayList<>();
    private List<Vehicle> queue = new ArrayList<>();
    private int slots = 10;
    private int used = 0;
    private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("hh:mm a");

    @PostMapping("/entry")
    public String entry(@RequestBody Vehicle v){
        if(lot.size() < slots){
            v.setEntryTime(LocalTime.now());
            lot.add(v);
            used++;
            return "Vehicle " + v.getVehicleNo() + " entered at " + v.getEntryTime().format(fmt);
        }else{
            queue.add(v);
            return "Parking full. " + v.getVehicleNo() + " added to waiting list.";
        }
    }

    @PostMapping("/exit/{vehicleNo}")
    public String exit(@PathVariable String vehicleNo){
        for(int i=0;i<lot.size();i++){
            Vehicle v = lot.get(i);
            if(v.getVehicleNo().equals(vehicleNo)){
                v.setExitTime(LocalTime.now());
                lot.remove(v);
                Duration d = Duration.between(v.getEntryTime(), v.getExitTime());
                long mins = d.toMinutes();
                String msg = "Vehicle " + v.getVehicleNo() + " stayed from " + v.getEntryTime().format(fmt) + " to " + v.getExitTime().format(fmt) + ". Total: " + mins + " mins.";
                if(!queue.isEmpty()){
                    Vehicle next = queue.remove(0);
                    next.setEntryTime(LocalTime.now());
                    lot.add(next);
                    msg += " Next vehicle " + next.getVehicleNo() + " moved from waiting list.";
                }
                used--;
                return msg;
            }
        }
        return "Vehicle not found.";
    }

    @GetMapping("/status")
    public Map<String, Object> getStatus(){
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("Total Slots", slots);
        map.put("Occupied", used);
        map.put("Available", slots - used);
        map.put("In Lot", lot.stream().map(Vehicle::getVehicleNo).toArray());
        map.put("Waiting", queue.stream().map(Vehicle::getVehicleNo).toArray());
        return map;
    }
}