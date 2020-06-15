package com.homework.nix.bookstore.admin.service.impl;

import com.homework.nix.bookstore.admin.service.BookCRUDService;
import com.homework.nix.bookstore.data.entity.Book;
import com.homework.nix.bookstore.data.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookCRUDServiceImpl implements BookCRUDService {

    private final BookRepository bookRepository;

    public BookCRUDServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void saveOrUpdate(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void remove(Long id) {
        bookRepository.deleteById(id);
    }


}
