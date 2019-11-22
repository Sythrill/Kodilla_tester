package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private int side;

    public Square(int side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getCircuit() {
        return 4 * this.side;
    }




}
