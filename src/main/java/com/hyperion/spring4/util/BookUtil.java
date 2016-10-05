package com.hyperion.spring4.util;

import com.hyperion.spring4.domain.BookDomain;
import com.hyperion.spring4.entity.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sujittripathy on 9/25/16.
 */
public class BookUtil {
    private static List<BookDomain> bookDomainList = new ArrayList<BookDomain>();

    public static List<BookDomain> sampleBooks(){
        BookDomain b1=new BookDomain();
        b1.setIsbn(100);
        b1.setAuthor("author-1");
        b1.setCntry("USA");
        b1.setTitle("title-1");
        b1.setPublisher("publisher-1");

        BookDomain b2=new BookDomain();
        b2.setIsbn(101);
        b2.setAuthor("author-2");
        b2.setCntry("USA");
        b2.setTitle("title-2");
        b2.setPublisher("publisher-2");

        BookDomain b3=new BookDomain();
        b3.setIsbn(102);
        b3.setAuthor("author-3");
        b3.setCntry("USA");
        b3.setTitle("title-3");
        b3.setPublisher("publisher-3");
        //List<BookDomain> bookDomainList= new ArrayList<BookDomain>();
        bookDomainList.add(b1);
        bookDomainList.add(b2);
        bookDomainList.add(b3);
        return bookDomainList;
    }

}
