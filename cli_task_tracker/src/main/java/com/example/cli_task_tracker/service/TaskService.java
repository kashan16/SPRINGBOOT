package com.example.cli_task_tracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cli_task_tracker.entity.Task;
import com.example.cli_task_tracker.repository.TaskRepository;


@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task addTask(String name , String description) {
        Task task = new Task();
        task.setName(name);
        task.setDescription(description);
        return taskRepository.save(task);
    }

    public List<Task> listTasks() {
        return taskRepository.findAll();
    }

    public Task updateTask(Long id , String name , String description , boolean completed) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new TaskNotFoundException(id));
        task.setName(name);
        task.setDescription(description);
        task.setCompleted(completed);

        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
