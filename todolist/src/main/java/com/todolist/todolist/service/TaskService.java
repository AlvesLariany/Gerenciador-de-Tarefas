package com.todolist.todolist.service;

import com.todolist.todolist.entity.TaskEntity;
import com.todolist.todolist.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    //Mais uma injeção de dependencia
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<TaskEntity> getAll() {
        return taskRepository.findAll();
    }

    public TaskEntity save(TaskEntity taskEntity){
        return taskRepository.save(taskEntity);
    }
}
