package com.mindhub.todolist;

import com.mindhub.todolist.Models.Task;
import com.mindhub.todolist.Models.UserEntity;
import com.mindhub.todolist.Repositories.TaskRepositorie;
import com.mindhub.todolist.Repositories.UserEntityRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataBaseInitializer implements CommandLineRunner {

    @Autowired
    UserEntityRepositorie userEntityRepositorie;
    @Autowired
    TaskRepositorie taskRepositorie;

    @Override
    public void run(String... args) throws Exception {

        UserEntity user = new UserEntity("facundo","223344","faq@hotmail.com");
        userEntityRepositorie.save(user);

        UserEntity user2 = new UserEntity("nacho","112233","nacho@hotmail.com");
        userEntityRepositorie.save(user2);

        UserEntity user3 = new UserEntity("gomez","223344","gomez@hotmail.com");
        userEntityRepositorie.save(user3);

        Task tasks = new Task("Task1","Test");
        user.addTask(tasks);
        taskRepositorie.save(tasks);

        Task tasks2 = new Task("Task2","Test2");
        user2.addTask(tasks2);
        taskRepositorie.save(tasks2);

        Task tasks3 = new Task("Task3","Test3");
        user3.addTask(tasks3);
        taskRepositorie.save(tasks3);

    }
}
