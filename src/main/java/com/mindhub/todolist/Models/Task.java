package com.mindhub.todolist.Models;

import com.mindhub.todolist.DTO.TaskDTO;
import com.mindhub.todolist.DTO.TaskPostDTO;
import com.mindhub.todolist.Enums.TaskStatus;
import jakarta.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String description;
    private TaskStatus status;
    @ManyToOne
    private UserEntity userEntity;

    public Task(){};

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.status = TaskStatus.PENDING;
    }

    public Task(TaskPostDTO taskPostDTO){
        this.title = taskPostDTO.getTitle();
        this.description = taskPostDTO.getDescription();
        this.status = TaskStatus.PENDING;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTittle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }
}