package com.example.demo;

public class MySingleton {

    private static MySingleton INSTANCE = new MySingleton();

    private MySingleton() {

    }

    public static MySingleton getINSTANCE() {
        return INSTANCE;
    }
}
