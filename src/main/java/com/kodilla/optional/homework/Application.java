package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Joe Doe", new Teacher("Tomas")));
        studentList.add(new Student("Joan Doe", new Teacher("Alan")));
        studentList.add(new Student("Fiona Shrek"));
        studentList.add(new Student("Bob Builder", new Teacher("Morgan")));
        studentList.add(new Student("Jack Fox"));


        for (Student student : studentList) {
            String teacher = student.getTeacher();
            System.out.println("uczeń: " + student.getStudentName() + ", nauczyciel: " + teacher);
        }
    }
}