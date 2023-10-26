package com.ota.app.versioning.controllers.v1;

import com.ota.app.versioning.model.Task;
import com.ota.app.versioning.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/tasks")
public class TaskController {
    private final TaskService taskService;

    @Autowired
    public TaskController(@Qualifier("v1") TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    // Define other endpoints for v1 here
}
