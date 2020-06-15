package com.homework.nix.bookstore.sale.containers;

import java.util.List;

public class ListContainer<T> {

    private List<T> items;

    public ListContainer(List<T> items) {
        this.items = items;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}
