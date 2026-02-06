package com.example.itemManagementApi.controller;

import com.example.itemManagementApi.model.Item;
import com.example.itemManagementApi.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
     }

    // Post items
    @PostMapping
    public ResponseEntity<?> addItem(@RequestBody Item item) {

        if (item.getName() == null || item.getName().isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Item name is required");
        }
        Item savedItem = itemService.addItem(item);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedItem);
    }

    // Get by id
    @GetMapping("/{id}")
    public ResponseEntity<?> getItemById(@PathVariable Long id) {

        Item item = itemService.getItemById(id);

        if (item == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Item not found with id: " + id);
        }
        return ResponseEntity.ok(item);
    }
}
