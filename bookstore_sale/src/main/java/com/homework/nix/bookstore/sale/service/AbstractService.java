package com.homework.nix.bookstore.sale.service;

import com.homework.nix.bookstore.data.entity.AbstractEntity;

import java.util.List;

public interface AbstractService<T extends AbstractEntity> {

    T findById(Long id);
    List<T> findAll();
}