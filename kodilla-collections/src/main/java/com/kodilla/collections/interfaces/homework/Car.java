package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public interface Car {
    Random random = new Random();

    int getSpeed(int speedUp, int speedDown);

    int increaseSpeed();

    int decreaseSpeed();

    static int getBreakingFactor() {
        return random.nextInt(100);
    }

    static int getAccelerationFactor() {
        return random.nextInt(200);
    }

}