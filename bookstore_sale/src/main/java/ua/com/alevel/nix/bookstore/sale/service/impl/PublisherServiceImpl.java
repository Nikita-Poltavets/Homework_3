package ua.com.alevel.nix.bookstore.sale.service.impl;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ua.com.alevel.nix.bookstore.data.entity.Publisher;
import ua.com.alevel.nix.bookstore.data.repository.PublisherRepository;
import ua.com.alevel.nix.bookstore.sale.service.PublisherService;

import java.util.List;

@Service
public class PublisherServiceImpl implements PublisherService {

    private final PublisherRepository publisherRepository;

    public PublisherServiceImpl(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void saveOrUpdate(Publisher publisher) {
        publisherRepository.save(publisher);
    }

    @Override
    public Publisher findById(Long id) {
        return publisherRepository.findById(id).orElse(null);
    }

    @Override
    public List<Publisher> findAll() {
        return publisherRepository.findAll(Sort.by("id"));
    }

    @Override
    public void remove(Long id) {
        publisherRepository.deleteById(id);
    }
}
