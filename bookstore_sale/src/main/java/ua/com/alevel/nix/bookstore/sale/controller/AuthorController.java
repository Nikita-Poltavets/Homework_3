package ua.com.alevel.nix.bookstore.sale.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ua.com.alevel.nix.bookstore.data.entity.Author;
import ua.com.alevel.nix.bookstore.sale.service.AuthorService;
import ua.com.alevel.nix.bookstore.webtool.data.response.DataContainer;
import ua.com.alevel.nix.bookstore.webtool.data.response.ListContainer;

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
