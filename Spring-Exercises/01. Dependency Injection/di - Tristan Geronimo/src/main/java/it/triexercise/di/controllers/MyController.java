package it.triexercise.di.controllers;

import it.triexercise.di.services.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyService myService;

    public MyController(MyService myService) {
        System.out.println("*** MyController() HAS BEEN CALLED");
        this.myService = myService;
    }

    @GetMapping("/getName")
    public String getName() {
        System.out.println("*** MyController.getName() HAS BEEN CALLED");
        return myService.getName();
    }

    @GetMapping
    public void getWelcomeMessage() {
        System.out.println("*** MyController.getWelcomeMessage() HAS BEEN CALLED");
        System.out.println("***** WELCOME TO THE SPRING APP!");
    }
}
