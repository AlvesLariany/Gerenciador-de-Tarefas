package com.todolist.todolist.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    private Integer id;
    private String taskName;
    private boolean isCompleted;
    private Date created;
    private Date closed;
}
