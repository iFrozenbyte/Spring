package ru.petproject.task.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeztController {

    @GetMapping("/tezt")
    public String testoz() {
        return "Tezzzt";
    }
}