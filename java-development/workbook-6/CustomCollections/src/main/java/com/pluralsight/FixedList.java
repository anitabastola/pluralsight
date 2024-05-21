package com.pluralsight;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private int maxSize;
    private List<T> items;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public int getMaxSize() {
        return maxSize;
    }


    public void add(T item) {
        if (items.size() < maxSize) {
            items.add(item);
        } else {
            throw new IllegalStateException("Maximum size exceeded");
        }
    }
    public List<T> getItems() {
        return items;
    }


}

