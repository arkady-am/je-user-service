package com.jesse.treffpunktservice.domain;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User addUserToCatalog(User user) {
        return repository.addUser(user);
    }

    public Iterable<User> getUserList() {
        return repository.getUsers();
    }
}
