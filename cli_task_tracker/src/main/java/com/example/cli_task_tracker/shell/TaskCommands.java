package com.example.cli_task_tracker.shell;


import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import com.example.cli_task_tracker.service.TaskService;

@ShellComponent
public class TaskCommands {
    private final TaskService taskService;

    public TaskCommands(TaskService taskService) {
        this.taskService = taskService;
    }

    @ShellMethod("Add a new task")
    public String addTask(String name , String description) {
        taskService.addTask(name, description);
        return "Task Added : " + name;
    }

    @ShellMethod("List all tasks") 
    public String listTasks() {
        return taskService.listTasks().toString();
    }

    @ShellMethod("Update task") 
    public String updateTask(Long id , String name , String description , boolean completed) {
        taskService.updateTask(id, name, description, completed);
        return "Task updated successfully : " + name + " " + description;
    }

    @ShellMethod("Delete task") 
    public String deleteTask(Long id) {
        taskService.deleteTask(id);
        return "Task deleted successfully";
    }
}
