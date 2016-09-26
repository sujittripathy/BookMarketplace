package com.hyperion.spring4.util;

import com.hyperion.spring4.domain.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sujittripathy on 9/25/16.
 */
public class BookUtil {
    private static List<Book> bookList= new ArrayList<Book>();

    public static List<Book> sampleBooks(){
        Book b1=new Book();
        b1.setIsbn(100);
        b1.setAuthor("author-1");
        b1.setCntry("USA");
        b1.setGender("male");
        b1.setTitle("title-1");
        b1.setPublisher("publisher-1");

        Book b2=new Book();
        b2.setIsbn(101);
        b2.setAuthor("author-2");
        b2.setCntry("USA");
        b2.setGender("male");
        b2.setTitle("title-2");
        b2.setPublisher("publisher-2");

        Book b3=new Book();
        b3.setIsbn(102);
        b3.setAuthor("author-3");
        b3.setCntry("USA");
        b3.setGender("male");
        b3.setTitle("title-3");
        b3.setPublisher("publisher-3");
        //List<Book> bookList= new ArrayList<Book>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        return bookList;
    }
}
