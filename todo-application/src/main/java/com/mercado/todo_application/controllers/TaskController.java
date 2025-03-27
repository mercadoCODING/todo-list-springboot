package com.mercado.todo_application.controllers;



import com.mercado.todo_application.dao.TaskRepository;
import com.mercado.todo_application.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TaskController {
    @Autowired
    private TaskRepository taskRepo;

    @GetMapping("/display")
    public String displayTasks(Model m){
        Task task = new Task();

        m.addAttribute("task",task);
        return "todo-page/todo-display";
    }

    @PostMapping("/create")
    public String createTasks(@ModelAttribute Task task){
        taskRepo.save(task);
        return "redirect:/todo/display";
    }
}
