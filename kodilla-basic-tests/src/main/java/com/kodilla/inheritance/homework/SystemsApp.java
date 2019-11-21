package com.kodilla.inheritance.homework;

public class SystemsApp {
    public static void main(String[] args) {
        LinuxSystem linuxSystem = new LinuxSystem("Debian",2008);
        WindowsSystem windowsSystem = new WindowsSystem("Windows 10", 2010);

        linuxSystem.turnOn();
        linuxSystem.displayLicence();
        System.out.println(linuxSystem.getName());
        System.out.println(linuxSystem.getYear());
        linuxSystem.kernelVersion();


        windowsSystem.turnOn();
        windowsSystem.displayLicence();
        System.out.println(windowsSystem.getName());
        System.out.println(windowsSystem.getYear());
        windowsSystem.printProducent();
    }
}
