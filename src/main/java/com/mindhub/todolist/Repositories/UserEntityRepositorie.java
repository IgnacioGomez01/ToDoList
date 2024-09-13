package com.mindhub.todolist.Repositories;
import com.mindhub.todolist.Models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntityRepositorie extends JpaRepository <UserEntity,Long>{

}