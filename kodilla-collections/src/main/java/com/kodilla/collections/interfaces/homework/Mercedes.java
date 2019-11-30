package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Mercedes implements Car {

    public static int accelerationFactor;
    public static int breakingFactor;
    private int turbo;
    private int driver;

    Random random = new Random();

    public Mercedes(int turbo, int driver) {
        accelerationFactor = getAccelerationFactor();
        breakingFactor = getBreakingFactor();
        this.turbo = turbo;
        this.driver = driver;
    }

    @Override
    public int getSpeed(int speedUp, int speedDown) {
        return (speedUp - speedDown) + driver;
    }

    @Override
    public int increaseSpeed() {
        int accelerator = random.nextInt(6);
        return accelerator * accelerationFactor + turbo;
    }

    @Override
    public int decreaseSpeed() {
        int accelerator = random.nextInt(8);
        return accelerator * breakingFactor;
    }


}
