package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Porshe implements Car {
    private int accelerationFactor;
    private int breakingFactor;
    private int turbo;
    private int abs;
    Random random = new Random();

    public Porshe(int accelerationFactor, int breakingFactor, int turbo, int abs) {
        this.accelerationFactor = accelerationFactor;
        this.breakingFactor = breakingFactor;
        this.turbo = turbo;
        this.abs = abs;
    }

    @Override

    public int getSpeed(int speedUp, int speedDown) {
        return (speedUp - speedDown);
    }

    @Override
    public int increaseSpeed() {
        int accelerator = random.nextInt(7);
        return accelerator * accelerationFactor + turbo;
    }

    @Override
    public int decreaseSpeed() {
        int accelerator = random.nextInt(4);
        return accelerator * breakingFactor - abs;
    }
}
