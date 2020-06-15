package com.homework.nix.bookstore.sale.controller;

import com.homework.nix.bookstore.data.entity.Author;
import com.homework.nix.bookstore.sale.containers.DataContainer;
import com.homework.nix.bookstore.sale.containers.ListContainer;
import com.homework.nix.bookstore.sale.service.AuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("authors")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public ResponseEntity<ListContainer<Author>> findAll() {
        return ResponseEntity.ok(new ListContainer<>(authorService.findAll()));
    }

    @GetMapping("/name")
    public ResponseEntity<ListContainer<Author>> findAllFirstNameOrLastNameContaining(@RequestParam String name) {
        return ResponseEntity.ok(new ListContainer<>(authorService.findByFirstNameOrLastNameContaining(name)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DataContainer<Author>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(new DataContainer<>(authorService.findById(id)));
    }
}
