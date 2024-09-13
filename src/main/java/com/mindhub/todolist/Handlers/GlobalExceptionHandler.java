package com.mindhub.todolist.Handlers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserEntityNotFound.class)
    public ResponseEntity<String> userEntityNotFoundExepctionHandler (UserEntityNotFound userEntityNotFound){
        return ResponseEntity.badRequest().body(userEntityNotFound.getMessage());
    }
    @ExceptionHandler(TaskNotFound.class)
    public ResponseEntity<String> taskNotFoundExepctionHandler (TaskNotFound taskNotFound){
        return ResponseEntity.badRequest().body(taskNotFound.getMessage());
    }
}
