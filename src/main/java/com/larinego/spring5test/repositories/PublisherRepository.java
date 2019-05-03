package com.larinego.spring5test.repositories;

import com.larinego.spring5test.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
