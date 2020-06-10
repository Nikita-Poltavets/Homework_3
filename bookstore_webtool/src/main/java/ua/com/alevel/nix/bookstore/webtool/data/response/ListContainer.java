package ua.com.alevel.nix.bookstore.webtool.data.response;

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
