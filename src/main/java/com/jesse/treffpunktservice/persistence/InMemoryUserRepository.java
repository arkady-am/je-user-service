package com.jesse.treffpunktservice.persistence;

import com.jesse.treffpunktservice.domain.User;
import com.jesse.treffpunktservice.domain.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class InMemoryUserRepository implements UserRepository {
    private static final Map<String, User> users = new ConcurrentHashMap<>();

    @Override
    public User addUser(User user) {
        String key = Integer.toString(user.hashCode());
        users.put(key, user);
        return user;
    }

    @Override
    public Iterable<User> getUsers() {
        return users.values();
    }
}
