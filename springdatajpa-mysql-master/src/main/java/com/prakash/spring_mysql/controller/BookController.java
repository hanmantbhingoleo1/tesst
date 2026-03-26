package com.prakash.spring_mysql.controller;

import com.prakash.spring_mysql.model.Book;
import com.prakash.spring_mysql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * BookController - Handles all HTTP requests related to Book operations.
 * Provides endpoints for adding, retrieving, and listing books.
 *
 * @author Prakash Karuppusamy
 */
@RestController // Marks this class as a REST Controller to handle HTTP requests
@RequestMapping("/books") // Base URL for all endpoints in this controller
public class BookController {

    @Autowired // Automatically injects BookService dependency
    private BookService bookService;

    /**
     * Adds a single book to the database.
     *
     * @param book The book details received in request body.
     * @return The saved book with generated ID.
     */
    @PostMapping("/add")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        return ResponseEntity.ok(bookService.saveBook(book));
    }

    /**
     * Adds multiple books to the database in a single request.
     *
     * @param books A list of books to be added.
     * @return The list of saved books.
     */
    @PostMapping("/addMultiple")
    public ResponseEntity<List<Book>> addMultipleBooks(@RequestBody List<Book> books) {
        books.forEach(book -> {
            System.out.println("DEBUG -> title: " + book.getTitle());
            System.out.println("DEBUG -> author: " + book.getAuthor());
            System.out.println("DEBUG -> price: " + book.getPrice());
        });
        return ResponseEntity.ok(bookService.saveMultipleBooks(books));
    }
    
    /**
     * Retrieves a book by its unique ID.
     *
     * @param id The ID of the book.
     * @return The book wrapped in an Optional, if found.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Book>> getBookById(@PathVariable Long id) {
        return ResponseEntity.ok(bookService.getBookById(id));
    }

    /**
     * Retrieves all books from the database.
     *
     * @return A list of all available books.
     */
    @GetMapping("/all")
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok(bookService.getAllBooks());
    }
}