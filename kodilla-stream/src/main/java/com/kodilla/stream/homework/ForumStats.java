package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25,4648, "Sales"));
        users.add(new User("Tuko Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Fring", 49,0,"Board"));
        users.add(new User("Gale Boetticher", 44,2,"Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));

        UserRepository userRepository = new UserRepository(users);


        double avgGreaterThanForty = userRepository.getUsers()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .map(user -> user.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();

        double avgLowerThanForty = userRepository.getUsers()
                .stream()
                .filter(user -> user.getAge() <= 40)
                .map(user -> user.getNumberOfPosts())
                .mapToInt(n -> n)
                .average().orElse(0.0);
        System.out.println("average number of posts for peope over 40 years old: " + avgGreaterThanForty +
                " average number of posts for peope under 40 years old: " + avgLowerThanForty);
    }
}