package com.ship;

public class Ship {

    private String name;
    private String year;

    public Ship(String name, String year) {
        this.name = name;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
    }

}
