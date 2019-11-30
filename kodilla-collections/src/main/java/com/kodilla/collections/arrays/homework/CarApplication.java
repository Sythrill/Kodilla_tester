package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Porsche;

import java.util.Random;

public class CarApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarType = random.nextInt(3);
        int tools = random.nextInt(20);
        int turbo = random.nextInt(11);
        int driver = random.nextInt(11);
        int abs = random.nextInt(8);

        if (drawnCarType == 0)
            return new Mercedes(turbo, driver);
        else if (drawnCarType == 1)
            return new Ford(tools);
        else
            return new Porsche(turbo, abs);

    }

}
