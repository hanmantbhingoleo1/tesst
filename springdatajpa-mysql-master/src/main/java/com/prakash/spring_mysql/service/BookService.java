package com.prakash.spring_mysql.service;

import com.prakash.spring_mysql.model.Book;
import com.prakash.spring_mysql.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * BookService - Service layer that contains business logic for managing books.
 *
 * This service interacts with the BookRepository to perform CRUD operations on the 'book' table.
 *
 * @author Prakash Karuppusamy
 */
@Service // Marks this class as a Spring Service, making it a Spring-managed bean.
public class BookService {

    @Autowired // Automatically injects the BookRepository bean
    private BookRepository bookRepository;

    /**
     * Retrieves all books from the database.
     *
     * @return List of all books.
     */
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    /**
     * Retrieves a book by its ID.
     *
     * @param id The ID of the book.
     * @return An Optional containing the book if found, otherwise empty.
     */
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    /**
     * Saves a single book in the database.
     *
     * @param book The book object to be saved.
     * @return The saved book object.
     */
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    /**
     * Saves multiple books in the database in a single operation.
     *
     * @param books A list of books to be saved.
     * @return A list of saved books.
     */
    public List<Book> saveMultipleBooks(List<Book> books) {
        return bookRepository.saveAll(books);
    }
}