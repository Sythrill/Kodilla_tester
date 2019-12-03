package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal,School> pupilsInSchool = new HashMap<>();

        Principal tom = new Principal("Tom", "Cruise");
        Principal robert = new Principal("Robert", "De Niro");
        Principal john = new Principal("John", "Travolta");

        School tomSchool = new School("School of Tom", 23,12,30,15,18);
        School robertSchool = new School("School of Robert", 34,12,17,18,27);
        School johnSchool = new School("School of John", 8,17,26,25,29);

        pupilsInSchool.put(tom,tomSchool);
        pupilsInSchool.put(robert,robertSchool);
        pupilsInSchool.put(john, johnSchool);

        for(Map.Entry<Principal,School> schoolEntry: pupilsInSchool.entrySet())
        System.out.println("Principal " + schoolEntry.getKey().getFirstName() + " " + schoolEntry.getKey().getLastName() + " has " + schoolEntry.getValue().toString());
    }
}
