package com.homework.nix.bookstore.admin.service.impl;

import com.homework.nix.bookstore.admin.service.AuthorCRUDService;
import com.homework.nix.bookstore.data.entity.Author;
import com.homework.nix.bookstore.data.repository.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorCRUDServiceImpl implements AuthorCRUDService {

    private final AuthorRepository authorRepository;

    public AuthorCRUDServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public void saveOrUpdate(Author author) {
        authorRepository.save(author);
    }

    @Override
    public void remove(Long id) {
        authorRepository.deleteById(id);
    }
}
