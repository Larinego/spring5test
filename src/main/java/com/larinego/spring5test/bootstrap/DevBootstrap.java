package com.larinego.spring5test.bootstrap;

import com.larinego.spring5test.model.Author;
import com.larinego.spring5test.model.Book;
import com.larinego.spring5test.model.Publisher;
import com.larinego.spring5test.repositories.AuthorRepository;
import com.larinego.spring5test.repositories.BookRepository;
import com.larinego.spring5test.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        Author author1 = new Author("Eric", "Evans");
        Publisher publisher1 = new Publisher("PublishHouse", "Minsk, Nezavis 12");
        Book book1 = new Book("Domaind Driven Design", "12345", publisher1);
        author1.getBooks().add(book1);
        book1.getAuthors().add(author1);

        authorRepository.save(author1);
        publisherRepository.save(publisher1);
        bookRepository.save(book1);

        Author author2 = new Author("Rod", "Johnson");
        Publisher publisher2 = new Publisher("PublishHouse", "Minsk, Nezavis 12");
        Book book2 = new Book("J2EE Development without EJB", "23444", publisher2);
        //author2.getBooks().add(book2);
        book2.getAuthors().add(author2);

        authorRepository.save(author2);
        publisherRepository.save(publisher2);
        bookRepository.save(book2);
    }


}
