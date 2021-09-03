package com.bouwhulp.userservice.rest.controller;

import com.bouwhulp.userservice.repository.UserRepository;
import com.bouwhulp.userservice.rest.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class UserDetailController {

    private UserRepository userRepository;

    @GetMapping("/user")
    public ResponseEntity<User> getUserDetails() {
        return ResponseEntity.ok(User.builder().build());
    }

    @PostMapping("/user")
    public ResponseEntity<Void> postUserDetails(@RequestBody Optional<User> optionalUser) {
        //Update user
        return ResponseEntity.accepted().build();
    }

    @PutMapping("/user")
    public ResponseEntity<UUID> putUserDetails(@RequestBody Optional<User> optionalUser) {
        //Add new user
        return ResponseEntity.accepted().build();
    }
}
