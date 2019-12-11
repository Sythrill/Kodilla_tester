package com.kodilla.stream;

import lombok.extern.java.Log;

import java.util.List;
import java.util.stream.Collectors;

@Log
public class UsersManager {
    public static void main(String[] args) {
        List<String> usernames = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(User::getUsername)
                .collect(Collectors.toList());
        log.info(String.valueOf(usernames));
    }
}
