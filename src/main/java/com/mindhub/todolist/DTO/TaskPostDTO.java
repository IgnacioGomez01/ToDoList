package com.mindhub.todolist.DTO;

import com.mindhub.todolist.Enums.TaskStatus;
import com.mindhub.todolist.Models.Task;

public class TaskPostDTO {

    private String title;
    private String description;

    public TaskPostDTO(){

    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

}