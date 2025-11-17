package com.todolist.todolist.repository;

import com.todolist.todolist.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TaskRepository extends JpaRepository <TaskEntity, Integer>{
}
