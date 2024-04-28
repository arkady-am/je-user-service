package com.jesse.treffpunktservice.web;

import com.jesse.treffpunktservice.domain.User;
import com.jesse.treffpunktservice.domain.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public User createUser(@Valid @RequestBody User user) {
        return service.addUserToCatalog(user);
    }

    @GetMapping
    public Iterable<User> index() {
        return service.getUserList();
    }


}
