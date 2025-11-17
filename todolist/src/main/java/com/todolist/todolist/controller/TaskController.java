package com.todolist.todolist.controller;


import com.todolist.todolist.entity.TaskEntity;
import com.todolist.todolist.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    //Injenção de dependencia do service
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<TaskEntity> getAll(){
        return taskService.getAll();
    }

    @PostMapping
    public TaskEntity createTask(@RequestBody TaskEntity task) {
        return taskService.save(task);
    }
}
