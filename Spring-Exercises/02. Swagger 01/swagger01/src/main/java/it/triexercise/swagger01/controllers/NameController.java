package it.triexercise.swagger01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myName")
public class NameController {

    @GetMapping
    public String getName() {
        return "my name is Tristan";
    }
}
