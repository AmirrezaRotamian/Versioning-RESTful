package com.ota.app.versioning.controllers.v2;

import com.ota.app.versioning.model.Task;
import com.ota.app.versioning.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v2/tasks")
public class TaskControllerV2 {

    private final TaskService taskService;

    @Autowired
    public TaskControllerV2(@Qualifier("v2") TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }
    // Define other endpoints for v2 here
}
