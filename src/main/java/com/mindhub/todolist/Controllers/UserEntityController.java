package com.mindhub.todolist.Controllers;

import com.mindhub.todolist.DTO.UserEntityDTO;
import com.mindhub.todolist.DTO.UserEntityPostDTO;
import com.mindhub.todolist.Services.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserEntityController {
    @Autowired
    UserEntityService userEntityService;

    @GetMapping
    public List<UserEntityDTO> getUserEntities(){
        return userEntityService.getUserEntities();
    }
    @GetMapping("/{id}")
    public UserEntityDTO getUserEntityById(@PathVariable long id){
        return userEntityService.getUserEntityById(id);
    }

    @PostMapping
    public ResponseEntity<String> postUserEntity(@RequestBody UserEntityPostDTO userEntityPostDTO){
        return userEntityService.postUserEntity(userEntityPostDTO);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUserEntity(@PathVariable long id){
        return userEntityService.deleteUserEntity(id);
    }

}