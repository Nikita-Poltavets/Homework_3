package com.homework.nix.bookstore.sale.service.impl;

import com.homework.nix.bookstore.data.entity.Author;
import com.homework.nix.bookstore.data.repository.AuthorRepository;
import com.homework.nix.bookstore.sale.service.AuthorService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> findByFirstNameOrLastNameContaining(String name) {
        return authorRepository.findByFirstNameOrLastNameContaining(name, name);
    }

    @Override
    public Author findById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll(Sort.by("id"));
    }
}
