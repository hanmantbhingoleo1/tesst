package com.prakash.spring_mysql.model;

import jakarta.persistence.*;


import lombok.*;

/**
 * Book - Entity class representing the 'book' table in the database.
 * This class is mapped to the 'book' table using JPA annotations.
 *
 * Lombok is used to generate boilerplate code such as getters, setters,
 * constructors, and toString method automatically.
 *
 * @author Prakash Karuppusamy
 */


import lombok.Data;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
// Marks this class as a JPA entity (database table representation)
@Table(name = "book") // Specifies the table name in the database
@Getter // Generates getter methods for all fields
@Setter // Generates setter methods for all fields
// Generates a constructor with all arguments
@ToString // Generates a toString method for easy debugging and logging
public class Book {

    @Id // Marks this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID generation
    private Long id;

    @Column(nullable = false) // Ensures that title cannot be null in the database
    private String title;
    private String author;
    private Double price;// Represents the book's price
    // Getters and Setters
    
	

	    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

		public Book(String title, String author, Double price) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	    }

}