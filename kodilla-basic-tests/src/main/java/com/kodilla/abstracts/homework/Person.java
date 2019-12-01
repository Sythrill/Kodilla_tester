package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }


    public void printResponsibilities() {
        System.out.println(this.firstName + ", job: " + this.job.getClass().getSimpleName() +", job responsibility is: " + this.job.getResponsibilities() );
    }
}
