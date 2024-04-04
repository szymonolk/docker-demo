package com.example.dockerdemo.controllers;

import com.example.dockerdemo.models.ToDoModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {

    @GetMapping("/all")
    public List<ToDoModel> getAllToDo(){
        return List.of(
                new ToDoModel(1, "Buy Milk", false),
                new ToDoModel(2, "Do some math", false),
                new ToDoModel(3, "Play on instrument", true)
        );
    }
}