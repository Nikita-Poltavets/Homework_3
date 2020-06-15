package com.homework.nix.bookstore.admin.service.controller;

import com.homework.nix.bookstore.admin.service.AuthorCRUDService;
import com.homework.nix.bookstore.data.entity.Author;
import com.homework.nix.bookstore.sale.containers.DataContainer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("authors")
public class AuthorController {

    private final AuthorCRUDService authorCRUDService;

    public AuthorController(AuthorCRUDService authorCRUDService) {
        this.authorCRUDService = authorCRUDService;
    }

    @PostMapping
    public ResponseEntity<DataContainer<Boolean>> save(@RequestBody Author author){
        authorCRUDService.saveOrUpdate(author);
        return ResponseEntity.status(201).body(new DataContainer<>(true));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<DataContainer<Boolean>> delete(@PathVariable Long id){
        authorCRUDService.remove(id);
        return ResponseEntity.status(201).body(new DataContainer<>(true));
    }
}
