package com.example.cli_task_tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CliTaskTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CliTaskTrackerApplication.class, args);
		System.out.println("Server Run....");
	}
}
