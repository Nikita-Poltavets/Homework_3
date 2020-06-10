package ua.com.alevel.nix.bookstore.sale.service.impl;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import ua.com.alevel.nix.bookstore.data.entity.Book;
import ua.com.alevel.nix.bookstore.data.entity.Publisher;
import ua.com.alevel.nix.bookstore.data.repository.BookRepository;
import ua.com.alevel.nix.bookstore.data.repository.PublisherRepository;
import ua.com.alevel.nix.bookstore.sale.service.BookService;

import java.util.Collections;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BookServiceImpl(BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public List<Book> findByBookName(String bookName) {
        return bookRepository.findByBookName(bookName);
    }

    @Override
    public List<Book> findByPublisherId(Long publisherId) {
        Publisher publisher = publisherRepository.findById(publisherId).orElse(null);
        if (publisher != null) {
            return bookRepository.findByPublisher(publisher);
        }
        return Collections.emptyList();
    }

    @Override
    public List<Book> findByAuthor(Long authorId) {
        return bookRepository.findByAuthor(authorId);
    }

    @Override
    public void saveOrUpdate(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll(Sort.by("id"));
    }

    @Override
    public void remove(Long id) {
        bookRepository.deleteById(id);
    }
}
