package com.kodilla.optional.homework;

import java.util.Optional;

public class Student {
    private String studentName;
    private Optional<String> teacher;

    public Student(String studentName, Teacher teacher) {
        this.studentName = studentName;
        this.teacher = Optional.ofNullable(teacher.getName());
    }

    public Student(String studentName) {
        this.studentName = studentName;
        this.teacher = Optional.of("undefined");
    }

    public String getStudentName() {
        return studentName;
    }

    public String getTeacher() {
        return String.valueOf(teacher);
    }
}