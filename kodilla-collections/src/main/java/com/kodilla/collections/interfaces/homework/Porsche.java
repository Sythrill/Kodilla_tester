package com.kodilla.collections.interfaces.homework;

import java.util.Objects;
import java.util.Random;

public class Porsche implements Car {
    public static int accelerationFactor;
    public static int breakingFactor;
    private int turbo;
    private int abs;
    Random random = new Random();

    public Porsche(int turbo, int abs) {
        accelerationFactor = getAccelerationFactor();
        breakingFactor = getBreakingFactor();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Porsche porsche = (Porsche) o;
        return turbo == porsche.turbo &&
                abs == porsche.abs &&
                Objects.equals(random, porsche.random);
    }

    @Override
    public int hashCode() {
        return Objects.hash(turbo, abs, random);
    }
}
