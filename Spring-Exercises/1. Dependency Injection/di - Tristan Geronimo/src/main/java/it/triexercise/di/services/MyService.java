package it.triexercise.di.services;

import it.triexercise.di.components.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent) {
        System.out.println("*** MyService() HAS BEEN CALLED");
        this.myComponent = myComponent;
    }

    public String getName() {
        System.out.println("*** MyService.getName() HAS BEEN CALLED");
        return myComponent.getMyComponentName();
    }
}
