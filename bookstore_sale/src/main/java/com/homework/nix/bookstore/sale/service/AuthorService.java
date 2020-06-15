package com.homework.nix.bookstore.sale.service;

import com.homework.nix.bookstore.data.entity.Author;

import java.util.List;

public interface AuthorService extends AbstractService<Author> {

    List<Author> findByFirstNameOrLastNameContaining(String name);
}
