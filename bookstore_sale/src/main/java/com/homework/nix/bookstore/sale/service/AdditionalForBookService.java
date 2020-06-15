package com.homework.nix.bookstore.sale.service;

import com.homework.nix.bookstore.data.entity.Book;

import java.util.List;

public interface AdditionalForBookService {

    List<Book> findByTitle(String title);
}
