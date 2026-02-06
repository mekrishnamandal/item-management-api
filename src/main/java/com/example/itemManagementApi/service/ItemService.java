package com.example.itemManagementApi.service;

import com.example.itemManagementApi.model.Item;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private final List<Item> items = new ArrayList<>();
    private long currentId = 1;

    // Add an item
    public Item addItem(Item item) {
        item.setId(currentId);
        currentId++;
        items.add(item);
        return item;
    }

    // Get that item by ID
    public Item getItemById(Long id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
}
