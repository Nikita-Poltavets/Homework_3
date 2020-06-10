package ua.com.alevel.nix.bookstore.data.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ua.com.alevel.nix.bookstore.data.entity.Book;
import ua.com.alevel.nix.bookstore.data.entity.Publisher;

import java.util.List;

@Repository
public interface BookRepository extends AbstractRepository<Book> {

    List<Book> findByBookName(String bookName);
    List<Book> findByPublisher(Publisher publisher);

    @Query("select book from Book book " +
            "join book.authorList author " +
            "where author.id = :authorId " +
            "order by book.id desc")
    List<Book> findByAuthor(@Param("authorId") Long authorId);
}
