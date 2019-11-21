package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private String name;
    private int year;

    public OperatingSystem(String name, int year) {
        this.name = name;
        this.year = year;

    }

    public void turnOn() {
        System.out.println("System " + name + " is turning on.");
    }

    public void turnOff() {
        System.out.println("System " + name + " is turning off.");
    }

    public void displayLicence() {
        System.out.println("vk7jg-nphtm-c97jm-9mpgt-3v66t");
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
