package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public interface Car {
    Random random = new Random();

    int getSpeed(int speedUp, int speedDown);

    int increaseSpeed();

    int decreaseSpeed();

    default int getBreakingFactor() {
        return random.nextInt(100);
    }

    default int getAccelerationFactor() {
        return random.nextInt(200);
    }

}