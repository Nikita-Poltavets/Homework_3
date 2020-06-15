package com.homework.nix.bookstore.sale.service.impl;

import com.homework.nix.bookstore.sale.service.AdditionalForBookService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.homework.nix.bookstore.data.entity.Book;
import com.homework.nix.bookstore.data.entity.Publisher;
import com.homework.nix.bookstore.data.repository.BookRepository;
import com.homework.nix.bookstore.data.repository.PublisherRepository;
import com.homework.nix.bookstore.sale.service.BookService;

import java.util.Collections;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BookServiceImpl(BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public List<Book> findByBookName(String bookName) {
        return bookRepository.findByBookName(bookName);
    }

    @Override
    public List<Book> findByPublisherId(Long publisherId) {
        Publisher publisher = publisherRepository.findById(publisherId).orElse(null);
        if (publisher != null) {
            return bookRepository.findByPublisher(publisher);
        }
        return Collections.emptyList();
    }

    @Override
    public List<Book> findByAuthor(Long authorId) {
        return bookRepository.findByAuthor(authorId);
    }

    @Override
    public Book findById(Long id){
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll(Sort.by("id"));
    }

    AdditionalForBookService additionalServiceForBook = new AdditionalForBookService() {
        @Override
        public List<Book> findByTitle(String title) {
            return bookRepository.findByTitle(title);
        }
    };


}
