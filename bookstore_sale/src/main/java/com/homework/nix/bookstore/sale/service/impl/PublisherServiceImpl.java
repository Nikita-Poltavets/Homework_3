package com.homework.nix.bookstore.sale.service.impl;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.homework.nix.bookstore.data.entity.Publisher;
import com.homework.nix.bookstore.data.repository.PublisherRepository;
import com.homework.nix.bookstore.sale.service.PublisherService;

import java.util.List;

@Service
public class PublisherServiceImpl implements PublisherService {

    private final PublisherRepository publisherRepository;

    public PublisherServiceImpl(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public Publisher findById(Long id) {
        return publisherRepository.findById(id).orElse(null);
    }

    @Override
    public List<Publisher> findAll() {
        return publisherRepository.findAll(Sort.by("id"));
    }
}
