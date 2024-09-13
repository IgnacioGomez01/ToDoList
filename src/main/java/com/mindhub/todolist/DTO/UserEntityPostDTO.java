package com.mindhub.todolist.DTO;

import com.mindhub.todolist.Models.UserEntity;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class UserEntityPostDTO {

    private String username;
    private String password;
    private String email;

    public UserEntityPostDTO(){
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

}
