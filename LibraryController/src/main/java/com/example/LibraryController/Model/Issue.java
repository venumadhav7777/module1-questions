package com.example.LibraryController.Model;



import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Issue implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate issueDate;
    private LocalDate returnDate;
    private Integer period;
    private Integer fine;

    @ManyToOne
    private Book book;

    @ManyToOne
    private User user;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public LocalDate getIssueDate() { return issueDate; }
    public void setIssueDate(LocalDate issueDate) { this.issueDate = issueDate; }
    public LocalDate getReturnDate() { return returnDate; }
    public void setReturnDate(LocalDate returnDate) { this.returnDate = returnDate; }
    public Integer getPeriod() { return period; }
    public void setPeriod(Integer period) { this.period = period; }
    public Integer getFine() { return fine; }
    public void setFine(Integer fine) { this.fine = fine; }
    public Book getBook() { return book; }
    public void setBook(Book book) { this.book = book; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Issue(Long id, LocalDate issueDate, LocalDate returnDate, Integer fine, Integer period, Book book, User user) {
        this.id = id;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.fine = fine;
        this.period = period;
        this.book = book;
        this.user = user;
    }
    public Issue(){

    }

}
