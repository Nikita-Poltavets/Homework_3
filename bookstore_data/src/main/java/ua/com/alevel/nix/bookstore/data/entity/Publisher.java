package ua.com.alevel.nix.bookstore.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "publishers")
public class Publisher extends AbstractEntity {

    @Column(name = "PUBLISHER_NAME", nullable = false)
    private String publisherName;

    public Publisher() {
        super();
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
}
