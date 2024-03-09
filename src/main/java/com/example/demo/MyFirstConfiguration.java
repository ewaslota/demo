package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class MyFirstConfiguration {

    @Bean("newerColors") //jeśli chcemy mieć inną nazwę niż nazwę metody
    public List<String>colors() {
        return List.of("RED", "BLUE", "GREEN");
    }

    @Bean
    @Scope("singleton")
    public Cookie cookie() {
        return new Cookie();
    }

    @Bean
    public Child john(Cookie cookie) {
        Child john = new Child(cookie);
        john.eatCookie();
        return john;
    }

    @Bean
    public Child malgosia(Cookie cookie) {
        Child malgosia = new Child(cookie);
        malgosia.eatCookie();
        return malgosia;
    }
}


