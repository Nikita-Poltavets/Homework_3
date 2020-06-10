package ua.com.alevel.nix.bookstore.sale.service.impl;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import ua.com.alevel.nix.bookstore.data.entity.Author;
import ua.com.alevel.nix.bookstore.data.repository.AuthorRepository;
import ua.com.alevel.nix.bookstore.sale.service.AuthorService;

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
    public void saveOrUpdate(Author author) {
        authorRepository.save(author);
    }

    @Override
    public Author findById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll(Sort.by("id"));
    }

    @Override
    public void remove(Long id) {
        authorRepository.deleteById(id);
    }
}
