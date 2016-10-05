package com.hyperion.spring4.repository;

import com.hyperion.spring4.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer>{
    List<Book> findByIsbn(Integer isbn);
    List<Book> findByTitle(String title);
}
