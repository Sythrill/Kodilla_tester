package com.kodilla.stream.homework;

import com.kodilla.stream.UserRepository;

public class ForumStats {
    public static void main(String[] args) {

        double avgGreaterThanForty = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .map(user -> user.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();

        double avgLowerThanForty = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() <= 40)
                .map(user -> user.getNumberOfPosts())
                .mapToInt(n -> n)
                .average().orElse(0.0);
        System.out.println("Średnia postów dla osób powyżej 40 lat: " + avgGreaterThanForty +
                " średnia postów dla osób poniżej 40 lat: " + avgLowerThanForty);
    }
}