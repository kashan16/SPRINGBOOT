package com.example.cli_task_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cli_task_tracker.entity.Task;

public interface TaskRepository extends JpaRepository<Task,Long>{}
