package com.kodilla.abstracts.homework;

public abstract class Shape {

    private String name;
    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();
    public abstract double getCircuit();

    public void printResult() {
        System.out.println(this.name + " area: " + getArea() + " circuit: " + getCircuit());
    }

}


