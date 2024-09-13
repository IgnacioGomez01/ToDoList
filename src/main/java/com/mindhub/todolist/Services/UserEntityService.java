package com.mindhub.todolist.Services;

import com.mindhub.todolist.DTO.UserEntityDTO;
import com.mindhub.todolist.DTO.UserEntityPostDTO;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface UserEntityService {

    public List<UserEntityDTO> getUserEntities();

    public UserEntityDTO getUserEntityById(long id);

    public ResponseEntity<String> postUserEntity(UserEntityPostDTO userEntityPostDTO);

    public ResponseEntity<String> deleteUserEntity(long id);
}
