package org.example.todo.service;

import org.example.todo.model.Task;
import org.example.todo.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TaskRepository repository;

    public TodoService(TaskRepository repository) {
        this.repository = repository;
    }

    public void addTask(Task task) {
        repository.save(task);
    }

    public List<Task> getTasks() {
        return repository.findAll();
    }

    public void updateTask(Long id) {
        Task task = repository.findById(id).orElse(null);

        if (task != null) {
            task.setStatus("completed");
            repository.save(task);
        }
    }

    public void deleteTask(Long id) {
        repository.deleteById(id);
    }
}