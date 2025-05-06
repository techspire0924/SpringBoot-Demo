package com.example.demo;

public class User {
    private String name;
    private int age;

    // Constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters (required for JSON serialization)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}