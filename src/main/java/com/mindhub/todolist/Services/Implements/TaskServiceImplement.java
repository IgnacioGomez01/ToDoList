package com.mindhub.todolist.Services.Implements;

import com.mindhub.todolist.DTO.TaskDTO;
import com.mindhub.todolist.DTO.TaskPostDTO;
import com.mindhub.todolist.Handlers.TaskNotFound;
import com.mindhub.todolist.Handlers.UserEntityNotFound;
import com.mindhub.todolist.Models.Task;
import com.mindhub.todolist.Models.UserEntity;
import com.mindhub.todolist.Repositories.TaskRepositorie;
import com.mindhub.todolist.Repositories.UserEntityRepositorie;
import com.mindhub.todolist.Services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskServiceImplement implements TaskService {
    @Autowired
    TaskRepositorie taskRepositorie;
    @Autowired
    UserEntityRepositorie userEntityRepositorie;


    public List<TaskDTO> getUserEntities(){
        return taskRepositorie.findAll().stream().map(TaskDTO::new).toList();
    }

    public TaskDTO getTaskById(long id){
        return taskRepositorie.findById(id).map(TaskDTO::new).orElseThrow(()->new TaskNotFound("The task with id "+id+" does not exist."));
    }

    public ResponseEntity<String> addTaskToUser(TaskPostDTO taskPostDTO,long id){
        UserEntity user = userEntityRepositorie.findById(id).orElseThrow(()->new UserEntityNotFound("The user with id "+id+" does not exist."));
        Task tasks = new Task(taskPostDTO);
        user.addTask(tasks);
        taskRepositorie.save(tasks);
        userEntityRepositorie.save(user);
        return ResponseEntity.ok("The new task of the user with id "+id+" was added successfully.");
    }

    public ResponseEntity<String> deleteTask(long id){
        if(!taskRepositorie.existsById(id)){
            return (ResponseEntity<String>) ResponseEntity.notFound();
        }
        taskRepositorie.deleteById(id);
        return ResponseEntity.ok("The task with id "+id+" has been deleted.");
    }
}
