package com.hyperion.spring4.repository;

import com.hyperion.spring4.entity.Book;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface BookRepository extends CrudRepository<Book,Integer>{
    List<Book> findByCntry(String cntry);
}
