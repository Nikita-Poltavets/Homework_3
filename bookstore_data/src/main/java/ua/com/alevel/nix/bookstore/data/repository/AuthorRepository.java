package ua.com.alevel.nix.bookstore.data.repository;

import org.springframework.stereotype.Repository;
import ua.com.alevel.nix.bookstore.data.entity.Author;

import java.util.List;

@Repository
public interface AuthorRepository extends AbstractRepository<Author> {

    List<Author> findByFirstNameOrLastNameContaining(String firstName, String lastName);
}
