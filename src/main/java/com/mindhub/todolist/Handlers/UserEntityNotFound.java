package com.mindhub.todolist.Handlers;

public class UserEntityNotFound extends RuntimeException{
    public UserEntityNotFound(String message) {
        super(message);
    }
}
