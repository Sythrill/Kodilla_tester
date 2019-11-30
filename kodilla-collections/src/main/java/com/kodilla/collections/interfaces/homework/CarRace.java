package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Mercedes mercedes = new Mercedes(3, 5);
        doRace(mercedes);

        Porsche porsche = new Porsche(7, 7);
        doRace(porsche);

        Ford ford = new Ford(12);
        doRace(ford);
    }

    private static void doRace(Car car) {
        int speedUp = 0;
        int speedDown = 0;
        for (int i = 0; i < 3; i++) {
            speedUp += car.increaseSpeed();
        }
        for (int i = 0; i < 2; i++) {
            speedDown +=car.decreaseSpeed();
        }

        System.out.println("Prędkość " + car.getClass().getSimpleName() + " wynosi " + car.getSpeed(speedUp, speedDown));
    }
}
