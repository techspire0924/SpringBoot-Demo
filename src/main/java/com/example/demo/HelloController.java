package com.example.demo;

import com.example.demo.model.Book;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/user")
    public User getUser() {
        return new User("Kevin", 30);
    }
    @PostMapping("/book")
    public String receiveBook(@RequestBody Book book) {
        return "Received book: " + book.getTitle() + " By " + book.getAuthor();
    }

    @GetMapping("/users/{id}")
    public String getUserInfo(@PathVariable int id) {
        return "User ID: " + id;
    }

    @GetMapping("/books/{title}/{author}")
    public Book getBook(@PathVariable String title, @PathVariable String author) {
        return new Book(title, author);
    }

    @GetMapping("/welcome")
    public String welcome(@RequestParam(defaultValue = "Guest") String name) {
        return "Welcome, " + name + "!";
    }
}
