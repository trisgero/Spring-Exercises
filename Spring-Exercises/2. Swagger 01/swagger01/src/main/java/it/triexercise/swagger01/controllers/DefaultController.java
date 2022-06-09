package it.triexercise.swagger01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DefaultController {

    @GetMapping
    public String getWelcomeMessage() {
        String link = "<font size=+2><a href=http://localhost:1235/swagger-ui/>http://localhost:1235/swagger-ui/</a></font>";
        return "Per favore, andare in " + link + " per avere più info riguardo l'API" +
                "<br><br> N.B. ho dovuto mapparlo nel port 1235 perché 1234 mi risulta occupato";
    }

}
