package it.triexercise.swagger02.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import it.triexercise.swagger02.entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping
    @ApiOperation(value = "Messaggio di benvenuto al MathAPI", notes = "Stampa messaggio di benvenuto per l'utente")
    public String welcomeMathMsg() {
        return "*** welcome to the Java-Spring Math Operation Simulator ***";
    }

    @GetMapping("/division-info")
    @ApiOperation(value = "Ricevi informazioni riguardo la divisione", notes = "Da all'utente informazioni riguardo la divisione ")
    public ArithmeticOperation getDivisionInfo() {
        String[] properties = {"Division by 1", "Division by 0", "Division by itself", "Division by an number"};
        return new ArithmeticOperation(
                "Division",
                0,
                "Division operation",
                properties);
    }

    @GetMapping("/multiplication")
    @ApiOperation(value = "Esegue la moltiplicazione", notes = "Da all'utente informazioni riguardo la divisione ")
    public int getMultiplicationOfTwoInts(
            @ApiParam(value = "Primo fattore") @RequestParam(required = true) int firstInt,
            @ApiParam(value = "Secondo fattore")@RequestParam(required = true) int secondInt
    ) {
        return firstInt * secondInt;
    }

    @GetMapping("/square/{n}")
    @ApiOperation(value = "Esegue elevamento alla seconda del numero scelto dall'utente", notes = "Ritorna come risultato il numero scelto dall'utente alla seconda")
    public int getSquareOfGivenInt(@ApiParam(value = "Numero da elevare alla seconda") @PathVariable int n) {
        return n * n;
    }
}