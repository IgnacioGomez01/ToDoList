package com.mindhub.todolist.Controllers;

import com.mindhub.todolist.DTO.TaskDTO;
import com.mindhub.todolist.DTO.TaskPostDTO;
import com.mindhub.todolist.Services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping
    public List<TaskDTO> getUserEntities(){
        return taskService.getUserEntities();
    }
    @GetMapping("/{id}")
    public TaskDTO getTaskById(@PathVariable long id){
        return taskService.getTaskById(id);
    }

    @PostMapping("/{id}")
    public ResponseEntity<String> addTaskToUser(@RequestBody TaskPostDTO taskPostDTO, @PathVariable long id){
        return taskService.addTaskToUser(taskPostDTO,id);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteTask(@PathVariable long id){
        return taskService.deleteTask(id);
    }
}
