package ua.com.alevel.nix.bookstore.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "books")
public class Book extends AbstractEntity {

    @Column(name = "BOOK_NAME", nullable = false)
    private String bookName;

    @Column(name = "ISBN", nullable = false, unique = true)
    private String isbn;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "TOTAL_PAGES", nullable = false)
    @Min(1)
    private Long totalPages;

    @Column(name = "DESCRIPTION", nullable = false, columnDefinition = "TEXT")
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "PUBLISHED_DATE", nullable = false)
    private Date publishedDate;

    @Column(name = "PRICE", nullable = false)
    @DecimalMin(value = "0.0", inclusive = false)
    @DecimalMax(value = "999.99")
    @Digits(integer = 3, fraction = 2)
    private BigDecimal price;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "PUBLISHER_ID", nullable = false)
    private Publisher publisher;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "book_dependency",
            joinColumns = @JoinColumn(name = "BOOK_ID"),
            inverseJoinColumns = @JoinColumn(name = "AUTHOR_ID"))
    private List<Author> authorList;

    public Book() {
        super();
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
