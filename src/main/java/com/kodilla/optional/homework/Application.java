package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Teacher teacher = new Teacher("<undefined>");

        studentList.add(new Student("Joe Doe", new Teacher("Tomas")));
        studentList.add(new Student("Joan Doe", new Teacher("Alan")));
        studentList.add(new Student("Fiona Shrek", null));
        studentList.add(new Student("Bob Builder", new Teacher("Morgan")));
        studentList.add(new Student("Jack Fox", null));


        for (Student student : studentList) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            System.out.println("uczeń: " + student.getStudentName() + ", nauczyciel: " + optionalTeacher.orElse(teacher).getName());
        }
    }
}