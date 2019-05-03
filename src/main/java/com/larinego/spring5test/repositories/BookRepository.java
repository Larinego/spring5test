package com.larinego.spring5test.repositories;

import com.larinego.spring5test.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}
