package it.triexercise.swagger02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DefaultController {

    @GetMapping
    public String getWelcomeMessage() {
        return "WELCOME to SWAGGER_02 exercise: " +
                "<br>Please do visit localhost:5050/swagger-ui/ for more infos";
    }

}
