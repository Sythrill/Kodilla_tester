package com.kodilla.optional.homework;

public class Student {
    private String studentName;
    private Teacher teacher;

    public Student(String studentName, Teacher teacher) {
        this.studentName = studentName;
        this.teacher = teacher;
    }

    public String getStudentName() {
        return studentName;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}