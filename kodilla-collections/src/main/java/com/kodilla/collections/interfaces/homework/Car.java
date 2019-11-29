package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public interface Car {

    int getSpeed(int speedUp, int speedDown);

    int increaseSpeed();

    int decreaseSpeed();

    int getAccelerationFactor();

    int getBreakingFactor();
}