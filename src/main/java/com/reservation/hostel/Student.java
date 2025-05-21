package com.reservation.hostel;

public class Student {
    private static int count = 1;
    private int id;
    private String name;
    private int age;
    private String gender;
    private String preference;
    private int roomNo;

    public Student(){}

    public Student(String name, int age, String gender, String preference){
        this.id = count++;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.preference = preference;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    public String getPreference(){
        return preference;
    }

    public int getRoomNo(){
        return roomNo;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setPreference(String preference){
        this.preference = preference;
    }

    public void setRoomNo(int roomNo){
        this.roomNo = roomNo;
    }
}