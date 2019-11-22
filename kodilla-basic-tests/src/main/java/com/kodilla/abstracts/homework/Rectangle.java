package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        super("Rectangle");
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public double getCircuit() {
        return 2 * sideA + 2 * sideB;
    }
}
