package com.ota.app.versioning.service.impl;

import com.ota.app.versioning.model.Task;
import com.ota.app.versioning.service.TaskService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("v1")
public class TaskServiceImpl implements TaskService {
    protected List<Task> tasks = new ArrayList<>();
    protected Long nextId = 1L;

    @Override
    public List<Task> getAllTasks() {
        return tasks;
    }

    @Override
    public Task getTaskById(Long id) {
        return null;
    }

    @Override
    public Task createTask(Task task) {
        Task tk = new Task();
        tk.setName("task 1");
        return tk;
    }

    @Override
    public Task updateTask(Long id, Task task) {
        return null;
    }

    @Override
    public void deleteTask(Long id) {

    }
}
