package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(5);
        square.printResult();

        Rectangle rectangle = new Rectangle(4, 10);
        rectangle.printResult();

        Triangle triangle = new Triangle(9, 5, 19, 7);
        triangle.printResult();

        Person person = new Person("Jan", 22,new Driver());
        person.printResponsibilities();

        Person person1 = new Person("Ala", 50, new Nurse());
        person1.printResponsibilities();

        Person person2 = new Person("Michał", 34, new Programmer());
        person2.printResponsibilities();

    }
}
