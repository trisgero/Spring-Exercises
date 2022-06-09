package it.triexercise.firstAPI05.controllers;

import it.triexercise.firstAPI05.entities.CarDTO;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public CarDTO getCarDTO() {
        return new CarDTO("TEST-ID","MODEL-NAME", 3.400);
    }

    @PostMapping
    public void addCar(@Valid @RequestBody CarDTO carDTO, HttpServletResponse response) {
        System.out.println("Added car: " + carDTO);
        response.setStatus(201);
    }


}
