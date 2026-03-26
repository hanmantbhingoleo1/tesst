package com.prakash.spring_mysql.repository;

import com.prakash.spring_mysql.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * BookRepository - Repository interface for performing CRUD operations on the 'book' table.
 *
 * This interface extends JpaRepository, which provides built-in methods for
 * database operations such as save, findById, findAll, delete, etc.
 *
 * Spring Data JPA automatically implements this interface at runtime,
 * so no need to provide an implementation class.
 *
 * @author Prakash Karuppusamy
 */
@Repository // Marks this interface as a Spring Data JPA repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // JpaRepository<Book, Long> specifies that this repository is for the 'Book' entity
    // and the primary key type is 'Long'.
}