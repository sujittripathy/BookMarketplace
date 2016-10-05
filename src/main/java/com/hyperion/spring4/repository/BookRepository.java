package com.hyperion.spring4.repository;

import com.hyperion.spring4.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer>{
    List<Book> findByCntry(String cntry);
    List<Book> findByTitle(String title);
}
