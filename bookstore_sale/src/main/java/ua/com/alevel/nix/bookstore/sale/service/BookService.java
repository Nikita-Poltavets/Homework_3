package ua.com.alevel.nix.bookstore.sale.service;

import ua.com.alevel.nix.bookstore.data.entity.Book;

import java.util.List;

public interface BookService extends AbstractService<Book> {

    List<Book> findByBookName(String bookName);
    List<Book> findByPublisherId(Long publisherId);
    List<Book> findByAuthor(Long authorId);
}
