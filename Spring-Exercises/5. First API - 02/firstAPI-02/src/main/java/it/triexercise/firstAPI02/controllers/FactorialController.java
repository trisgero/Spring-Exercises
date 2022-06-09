package it.triexercise.firstAPI02.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class FactorialController {

    @GetMapping("/{number}")
    public int getFactorial(@PathVariable int number) {
        int f = number;
        for (int i = number - 1; i > 0; i--) f *= i;
        return f;
    }
}
