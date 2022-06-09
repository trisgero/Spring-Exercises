package it.triexercise.firstAPI03.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strings")
public class StringController {

    @GetMapping("")
    public String getConcatenatedStrings(@RequestParam String firstString, @RequestParam (required = false) String secondString) {
        String concatStrings = firstString + secondString;
        if (secondString == null) return firstString;
        return concatStrings;
    }
}
