package com.ota.app.versioning.service.impl;

import com.ota.app.versioning.model.Task;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("v2")
public class TaskServiceV2Impl extends TaskServiceImpl {
    @Override
    public Task createTask(Task task) {
        // Your custom logic for creating tasks in version 2
        Task createdTask = new Task();
        // Implement your custom logic here
        return createdTask;
    }
}
