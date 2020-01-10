package com.kodilla.stream;

import lombok.Getter;
import lombok.extern.java.Log;

import java.util.List;
@Log
@Getter
public class UserRepository {
    private List<User> users;
    public UserRepository(List<User> users) {
        this.users = users;
    }
}