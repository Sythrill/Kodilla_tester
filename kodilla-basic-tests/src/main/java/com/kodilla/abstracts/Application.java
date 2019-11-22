package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.giveVoice();
        System.out.println(dog.getNumberOfLegs());

        Duck duck = new Duck();
        duck.giveVoice();
        System.out.println(duck.getNumberOfLegs());

        Animal doggy = new Dog();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(doggy);
    }
}
