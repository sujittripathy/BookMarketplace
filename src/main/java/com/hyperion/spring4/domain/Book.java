package com.hyperion.spring4.domain;

/**
 * Created by sujittripathy on 9/22/16.
 */
public class Book {
    private int isbn;
    private String title;
    private String author;
    private String gender;
    private String publisher;
    private String cntry;

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

    public int getIsbn() {

        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
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
