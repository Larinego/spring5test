package com.larinego.spring5test.repositories;

import com.larinego.spring5test.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
