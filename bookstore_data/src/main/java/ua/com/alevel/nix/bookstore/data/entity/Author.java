package ua.com.alevel.nix.bookstore.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ua.com.alevel.nix.bookstore.data.listener.FullNameGenerationListener;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "authors")
@EntityListeners({ FullNameGenerationListener.class })
public class Author extends AbstractEntity {

    @Column(name = "FIRST_NAME", unique = true, nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", unique = true, nullable = false)
    private String lastName;

    @JsonIgnore
    @ManyToMany(mappedBy = "authorList")
    private List<Book> bookList;

    @Transient
    private String fullName;

    public Author() {
        super();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
