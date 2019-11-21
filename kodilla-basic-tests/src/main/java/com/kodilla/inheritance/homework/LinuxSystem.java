package com.kodilla.inheritance.homework;

public class LinuxSystem extends OperatingSystem {

    public LinuxSystem(String name, int year) {
        super(name, year);
    }

    public void displayLicence() {
        System.out.println("This is open source product.");
    }

    public void kernelVersion() {
        System.out.println("2.04");
    }

}

