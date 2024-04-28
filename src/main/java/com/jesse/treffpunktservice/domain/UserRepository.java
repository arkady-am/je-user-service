package com.jesse.treffpunktservice.domain;

public interface UserRepository {

    User addUser(User user);

    Iterable<User> getUsers();
}
