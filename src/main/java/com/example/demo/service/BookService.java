package com.example.demo.service;
import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository repo;
    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    public Book getBookById(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
    }

    public Book addBook(Book book) {
        return repo.save(book);
    }

    public Book updateBook(Long id, Book updated) {
        Book book = getBookById(id);
        book.setTitle(updated.getTitle());
        book.setAuthor(updated.getAuthor());
        return repo.save(book);
    }

    public void deleteBook(Long id) {
        repo.deleteById(id);
    }
}
