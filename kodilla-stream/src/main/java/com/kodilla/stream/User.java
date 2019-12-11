package com.kodilla.stream;

import lombok.Getter;
import lombok.extern.java.Log;

import java.util.Objects;
@Log
@Getter
public class User {
    private String username;
    private int age;
    private int numberOfPosts;
    private String group;

    public User(String username, int age, int numberOfPosts, String group) {
        this.username = username;
        this.age = age;
        this.numberOfPosts = numberOfPosts;
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                numberOfPosts == user.numberOfPosts &&
                Objects.equals(username, user.username) &&
                Objects.equals(group, user.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, age, numberOfPosts, group);
    }

}
