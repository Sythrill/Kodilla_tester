package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Integer> pupils = new ArrayList<>();

    public School( String schoolName, int... pupils){
        for(int pupil : pupils)
            this.pupils.add(pupil);
        this.schoolName = schoolName;
    }

    public int getSumOfPupils() {
        int sum =0;
        for (int pupil : pupils)
            sum += pupil;
        return sum;

    }

    @Override
    public String toString() {
        return "school: \"" + schoolName + "\" with " + getSumOfPupils()+ " pupils.";
    }
}
