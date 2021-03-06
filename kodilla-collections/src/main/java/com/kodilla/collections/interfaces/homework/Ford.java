package com.kodilla.collections.interfaces.homework;

import java.util.Objects;
import java.util.Random;

public class Ford implements Car {

    public static int accelerationFactor;
    public static int breakingFactor;
    private int tools;

    Random random = new Random();

    public Ford( int tools) {
        accelerationFactor = getAccelerationFactor();
        breakingFactor = getBreakingFactor();
        this.tools = tools;

    }

    @Override
    public int getSpeed(int speedUp, int speedDown) {
        return (speedUp - speedDown) + tools;
    }

    @Override
    public int increaseSpeed() {
        int accelerator = random.nextInt(15);
        return accelerator * accelerationFactor;
    }

    @Override
    public int decreaseSpeed() {
        int accelerator = random.nextInt(11);
        return accelerator * breakingFactor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return tools == ford.tools &&
                Objects.equals(random, ford.random);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tools, random);
    }
}
