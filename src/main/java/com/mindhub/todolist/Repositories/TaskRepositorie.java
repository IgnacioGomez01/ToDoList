package com.mindhub.todolist.Repositories;
import com.mindhub.todolist.Models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TaskRepositorie extends JpaRepository<Task,Long> {
}