package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Porsche;

import java.util.Random;

public class CarUtils {

    public static void describeCar(Car car) {
        Random random = new Random();
        int speedUp = random.nextInt(200);
        int speedDown = random.nextInt(150);
        System.out.println("*************************************");
        System.out.println("Car name: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed(speedUp, speedDown));
        System.out.println("Car breaks: " + car.decreaseSpeed());
        System.out.println("Car acceleration: " + car.increaseSpeed());
        System.out.println("Car acceleration factor: " + car.getAccelerationFactor());
        System.out.println("Car breaking factor: " + car.getBreakingFactor());

    }

    private static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Mercedes)
            return "Mercedes";
        else if (car instanceof Porsche)
            return "Porsche";
        else
            return "Unknown type of car";
    }

}
