package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    //mechanizm w Java "refleksja" ale może prowadzić do komplikacji
   // @Autowired
    private final Engine engine;

    //Najlepszą metodą jest używanie konstruktora
    public Car(Engine engine) {
        this.engine = engine;
    }


    //niepotrzebny konstruktor przy Autowired
//    @Autowired
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }
}
