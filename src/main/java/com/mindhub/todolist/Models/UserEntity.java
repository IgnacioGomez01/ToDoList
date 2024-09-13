package com.mindhub.todolist.Models;

import com.mindhub.todolist.DTO.UserEntityDTO;
import com.mindhub.todolist.DTO.UserEntityPostDTO;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import org.apache.catalina.User;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String username;
    private String password;
    private String email;
    @OneToMany(mappedBy="userEntity",cascade = CascadeType.REMOVE)
    private Set<Task> tasks = new HashSet<>();

    public UserEntity(){};

    public UserEntity(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public UserEntity(UserEntityPostDTO userEntityPostDTO){
        this.username = userEntityPostDTO.getUsername();
        this.password = userEntityPostDTO.getPassword();
        this.email= userEntityPostDTO.getEmail();
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task task){
        task.setUserEntity(this);
        tasks.add(task);
    }

}

