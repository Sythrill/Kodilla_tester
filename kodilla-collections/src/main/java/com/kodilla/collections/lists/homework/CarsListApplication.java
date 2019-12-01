package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Porsche;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car mercedes = new Mercedes(5,19);
        cars.add(mercedes);
        cars.add(new Ford(23));
        cars.add(new Porsche(17,8));

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(1);
        cars.remove(mercedes);
        cars.remove(new Porsche(17,8));

        System.out.println(cars.size());

        for (Car car: cars) {
            CarUtils.describeCar(car);
        }
    }
}
