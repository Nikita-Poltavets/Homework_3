package com.homework.nix.bookstore.sale.service;

import com.homework.nix.bookstore.data.entity.Book;

import java.util.List;

public interface BookService extends AbstractService<Book> {

    List<Book> findByBookName(String bookName);
    List<Book> findByPublisherId(Long publisherId);
    List<Book> findByAuthor(Long authorId);
}
