package com.example.demo;

public class Child {

    private Cookie cookie;

    public Child(Cookie cookie) {
        this.cookie = cookie;
    }

    public void eatCookie() {
        this.cookie.eat();
    }
}

class Cookie {

    private boolean eaten = false;

    public void eat() {
        if (eaten) {
            System.out.println("Ciastko już zjedzone");
        } else {
            eaten = true;
            System.out.println("Miam!");
        }
    }
}
