package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Title must not be blank")
    private String title;
    @NotBlank(message = "Author must not be blank")
    private String author;

    // Default constructor (required for @RequestBody)
    public Book() {}
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
