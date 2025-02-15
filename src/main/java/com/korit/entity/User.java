package com.korit.entity;

import com.korit.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private static UserRepository instance;
    private Long id;
    private String username;
    private String password;
    private String email;
}
