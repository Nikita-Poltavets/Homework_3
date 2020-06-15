package com.homework.nix.bookstore.data.listener;

import org.springframework.util.StringUtils;
import com.homework.nix.bookstore.data.entity.Author;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;

public class FullNameGenerationListener {

    @PostLoad
    @PostPersist
    @PostUpdate
    public void generateFullName(Author author){
        if (StringUtils.isEmpty(author.getFirstName()) || StringUtils.isEmpty(author.getLastName())){
            author.setFullName(null);
            return;
        }
        author.setFullName(author.getFirstName() + " " + author.getLastName());
    }
}
