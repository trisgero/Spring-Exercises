package it.triexercise.swagger02.entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArithmeticOperation {

    @ApiModelProperty(value = "Nome della operazione matematica", example = "Moltiplicazione")
    private String name;
    @ApiModelProperty(value = "Numero minimo di operandi necessari per svolgere l'operazione", example = "2")
    private int minNumberOfOperands;
    @ApiModelProperty(value = "Descrizione della operazione", example = "Fattore * fattore = prodotto")
    private String description;
    @ApiModelProperty(value = "Lista di proprietà della operazione", example = "['Commutativa', 'Associativa', 'Distributiva']")
    private String[] properties;


}
