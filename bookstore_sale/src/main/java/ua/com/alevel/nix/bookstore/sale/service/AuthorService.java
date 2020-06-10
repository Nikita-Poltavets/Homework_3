package ua.com.alevel.nix.bookstore.sale.service;

import ua.com.alevel.nix.bookstore.data.entity.Author;

import java.util.List;

public interface AuthorService extends AbstractService<Author> {

    List<Author> findByFirstNameOrLastNameContaining(String name);
}
