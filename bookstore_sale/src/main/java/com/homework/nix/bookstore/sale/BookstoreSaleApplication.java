package com.homework.nix.bookstore.sale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.homework.nix.bookstore.data.entity")
@EnableJpaRepositories("com.homework.nix.bookstore.data.repository")
public class BookstoreSaleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookstoreSaleApplication.class, args);
    }
}
