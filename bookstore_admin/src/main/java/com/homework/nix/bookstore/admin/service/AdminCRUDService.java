package com.homework.nix.bookstore.admin.service;

import com.homework.nix.bookstore.data.entity.AbstractEntity;

public interface AdminCRUDService<T extends AbstractEntity> {

    void saveOrUpdate(T t);
    void remove(Long id);
}