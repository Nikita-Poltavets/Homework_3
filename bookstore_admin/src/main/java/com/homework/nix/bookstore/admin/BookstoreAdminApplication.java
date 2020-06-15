package com.homework.nix.bookstore.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.homework.nix.bookstore.data.entity")
@EnableJpaRepositories("com.homework.nix.bookstore.data.repository")
public class BookstoreAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookstoreAdminApplication.class, args);
    }
}
