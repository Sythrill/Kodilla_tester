package com.kodilla.optional.homework;

import java.util.Optional;

public class Student {
    private String studentName;
    private Teacher teacher1;
    private Optional<Object> teacher;

    public Student(String studentName, Teacher teacher) {
        this.studentName = studentName;
        this.teacher = Optional.ofNullable(teacher);
    }

    public Student(String studentName) {
        this.studentName = studentName;
        this.teacher = Optional.empty();
    }

    public String getStudentName() {
        return studentName;
    }

    public Teacher getTeacher() {
        return teacher1;
    }
}