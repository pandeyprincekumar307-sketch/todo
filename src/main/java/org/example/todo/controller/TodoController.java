package org.example.todo.controller;

import org.example.todo.model.Task;
import org.example.todo.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("tasks", todoService.getTasks());
        return "home";
    }

    @PostMapping("/add-task")
    public String addTask(@RequestParam String title, @RequestParam String priority){
        Task task = new Task( title, priority, "Pending");
        todoService.addTask(task);
        return "redirect:/";
    }

    @GetMapping("/update-status/{id}")
    public String updateStatus(@PathVariable Long id){
        todoService.updateTask(id);
        return "redirect:/";c
    }
    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        todoService.deleteTask(id);
        return "redirect:/";
    }
}
