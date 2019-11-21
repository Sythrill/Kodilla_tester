package com.kodilla.inheritance.homework;

public class WindowsSystem extends OperatingSystem {
    WindowsSystem(String name, int year) {
        super(name, year);
    }

    public void printProducent() {
        System.out.println("Made by Microsoft.");
    }
}
