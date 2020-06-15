package com.homework.nix.bookstore.sale.controller;

import com.homework.nix.bookstore.data.entity.Book;
import com.homework.nix.bookstore.sale.containers.DataContainer;
import com.homework.nix.bookstore.sale.containers.ListContainer;
import com.homework.nix.bookstore.sale.service.AdditionalForBookService;
import com.homework.nix.bookstore.sale.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<ListContainer<Book>> findAll() {
        return ResponseEntity.ok(new ListContainer<>(bookService.findAll()));
    }

    @GetMapping("/name")
    public ResponseEntity<ListContainer<Book>> findByBookName(@RequestParam String name) {
        return ResponseEntity.ok(new ListContainer<>(bookService.findByBookName(name)));
    }

    @GetMapping("/publishers/{id}")
    public ResponseEntity<ListContainer<Book>> findByPublisher(@PathVariable Long id) {
        return ResponseEntity.ok(new ListContainer<>(bookService.findByPublisherId(id)));
    }

    @GetMapping("/authors/{id}")
    public ResponseEntity<ListContainer<Book>> findByAuthor(@PathVariable Long id) {
        return ResponseEntity.ok(new ListContainer<>(bookService.findByAuthor(id)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DataContainer<Book>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(new DataContainer<>(bookService.findById(id)));
    }
}
