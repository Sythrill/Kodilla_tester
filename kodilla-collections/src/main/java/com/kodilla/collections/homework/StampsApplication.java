package com.kodilla.collections.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Mauritius 1988 Mi", 6.74, 6.77, false));
        stamps.add(new Stamp("Mauritius 1977 Mi", 2.94, 2.97, true));
        stamps.add(new Stamp("Maroko 1965 Mi", 5.50, 5.52, false));
        stamps.add(new Stamp("Maroko 1960 Mi", 4.62, 4.69, false));
        stamps.add(new Stamp("Maroko 1960 Mi", 4.62, 4.69, true));
        stamps.add(new Stamp("Mauritius 1988 Mi", 6.74, 6.77, false));

        System.out.println("Wielkość kolekcji " + stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}