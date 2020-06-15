package com.homework.nix.bookstore.admin.service.impl;

import com.homework.nix.bookstore.admin.service.PublisherCRUDService;
import com.homework.nix.bookstore.data.entity.Publisher;
import com.homework.nix.bookstore.data.repository.PublisherRepository;
import org.springframework.stereotype.Service;

@Service
public class PublisherCRUDServiceImpl implements PublisherCRUDService {

    private final PublisherRepository publisherRepository;

    public PublisherCRUDServiceImpl(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void saveOrUpdate(Publisher publisher) {
        publisherRepository.save(publisher);
    }

    @Override
    public void remove(Long id) {
        publisherRepository.deleteById(id);
    }
}
