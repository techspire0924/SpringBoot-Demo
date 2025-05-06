// controller/BookController.java
package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // CREATE
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    // READ ALL
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book updated) {
        return bookService.updateBook(id, updated);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}
