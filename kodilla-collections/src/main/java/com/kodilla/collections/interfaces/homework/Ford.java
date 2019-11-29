package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Ford implements Car {

    private int accelerationFactor;
    private int breakingFactor;
    private int tools;

    Random random = new Random();

    public Ford(int accelerationFactor, int breakingFactor, int tools) {
        this.accelerationFactor = accelerationFactor;
        this.breakingFactor = breakingFactor;
        this.tools = tools;

    }

    @Override
    public int getAccelerationFactor() {
        return accelerationFactor;
    }

    @Override
    public int getBreakingFactor(){
        return breakingFactor;
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


}
