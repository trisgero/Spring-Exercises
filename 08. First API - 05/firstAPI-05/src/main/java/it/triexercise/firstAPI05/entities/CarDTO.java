package it.triexercise.firstAPI05.entities;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CarDTO {

    @NotNull(message = "*** MUST INCLUDE THIS FIELD ***")
    private String id;
    @NotBlank(message = "*** MUST INCLUDE THIS FIELD ***")
    private String modelName;
    private double price;

    public CarDTO(String id, String modelName, double price) {
        this.id = id;
        this.modelName = modelName;
        this.price = price;
    }
}
