package com.mindhub.todolist.DTO;

import com.mindhub.todolist.Enums.TaskStatus;
import com.mindhub.todolist.Models.Task;
import com.mindhub.todolist.Models.UserEntity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class TaskDTO {
    private long id;
    private String title;
    private String description;
    private TaskStatus status;
    private long userID;

    public TaskDTO(Task task){
        this.id = task.getId();
        this.title = task.getTitle();
        this.description = task.getDescription();
        this.status = task.getStatus();
        this.userID = task.getUserEntity().getId();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public TaskStatus getStatus() {
        return status;
    }
    public long getUserID() {
        return userID;
    }
}
