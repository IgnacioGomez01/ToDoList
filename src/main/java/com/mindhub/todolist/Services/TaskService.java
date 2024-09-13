package com.mindhub.todolist.Services;

import com.mindhub.todolist.DTO.TaskDTO;
import com.mindhub.todolist.DTO.TaskPostDTO;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TaskService {

    public List<TaskDTO> getUserEntities();

    public TaskDTO getTaskById(long id);

    public ResponseEntity<String> addTaskToUser(TaskPostDTO taskPostDTO, long id);

    public ResponseEntity<String> deleteTask(long id);
}