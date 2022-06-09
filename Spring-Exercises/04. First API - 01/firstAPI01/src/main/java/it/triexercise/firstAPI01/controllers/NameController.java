package it.triexercise.firstAPI01.controllers;

import it.triexercise.firstAPI01.entities.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class NameController {
    @Autowired
    private Name name;

    //    API call using: http://localhost:8080/v2/name
    @GetMapping("/name")
    public String getName() {
        return name.getName();
    }

    //    API call using: http://localhost:8080/v2/reversedName
    @PostMapping("/reversedName")
    public String getReversedName(@RequestBody String name) {
        return new StringBuilder().append(name).reverse().toString();
    }


}
