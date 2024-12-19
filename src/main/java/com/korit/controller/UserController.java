package com.korit.controller;

import com.korit.entity.User;
import com.korit.repository.UserRepository;
import com.korit.service.UserService;
import com.korit.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
public class UserController {

    @Setter
    private UserService userService;

//    RequiredArgsConstructor로 대체
//    public UserController(UserServiceImpl userService) {
//        this.userService = userService;
//    }

    public void signIn() {

    }

    public void signUp() {
        String username = "test";
        String password = "1234";
        String email = "test@gmail.com";
        User user = User.builder()
                .username(username)
                .password(password)
                .email(email)
                .build();
        userService.add(user);
    }
}
