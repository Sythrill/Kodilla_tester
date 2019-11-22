package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    private int sideA;
    private int sideB;
    private int base;
    private int height;

    public Triangle(int sideA, int sideB, int base, int height) {
        super("Triangle");
        this.sideA = sideA;
        this.sideB = sideB;
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (this.base * this.height) / 2;
    }

    @Override
    public double getCircuit() {
        return this.sideA + this.sideB + this.base;
    }
}
