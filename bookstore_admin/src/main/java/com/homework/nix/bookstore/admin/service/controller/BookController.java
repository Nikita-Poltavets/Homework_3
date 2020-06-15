package com.homework.nix.bookstore.admin.service.controller;

import com.homework.nix.bookstore.admin.service.BookCRUDService;
import com.homework.nix.bookstore.data.entity.Book;
import com.homework.nix.bookstore.sale.containers.DataContainer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("books")
public class BookController {

    private final BookCRUDService bookCRUDService;

    public BookController(BookCRUDService bookCRUDService) {
        this.bookCRUDService = bookCRUDService;
    }

    @PostMapping
    public ResponseEntity<DataContainer<Boolean>> save(@RequestBody Book book){
        bookCRUDService.saveOrUpdate(book);
        return ResponseEntity.status(202).body(new DataContainer<>(true));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<DataContainer<Boolean>> delete(@PathVariable Long id){
        bookCRUDService.remove(id);
        return ResponseEntity.status(202).body(new DataContainer<>(true));
    }
}
