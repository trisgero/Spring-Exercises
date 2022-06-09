package it.triexercise.di.components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent() {
        System.out.println("*** MyComponent() HAS BEEN CALLED");
        this.myComponentName = "Tristan Geronimo";
    }

    public String getMyComponentName() {
        System.out.println("*** MyComponent.getMyComponentName() HAS BEEN CALLED");
        return myComponentName;
    }
}
