package com.mindhub.todolist.Handlers;

public class TaskNotFound extends  RuntimeException{
    public TaskNotFound(String message) {
        super(message);
    }
}