package com.homework.nix.bookstore.data.repository;

import com.homework.nix.bookstore.data.entity.Author;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends AbstractRepository<Author> {

    List<Author> findByFirstNameOrLastNameContaining(String firstName, String lastName);

    Author deleteByFirstName(String firstName);
}
