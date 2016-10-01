package com.hyperion.spring4.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int isbn;
    private String title;
    private String author;
    private String gender;
    private String publisher;
    private String cntry;

    protected Book() {  }

    public Book(String title, String author, String gender, String publisher, String cntry) {
        this.title = title;
        this.author = author;
        this.gender = gender;
        this.publisher = publisher;
        this.cntry = cntry;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCntry() {
        return cntry;
    }

    public void setCntry(String cntry) {
        this.cntry = cntry;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", gender='" + gender + '\'' +
                ", publisher='" + publisher + '\'' +
                ", cntry='" + cntry + '\'' +
                '}';
    }
}
