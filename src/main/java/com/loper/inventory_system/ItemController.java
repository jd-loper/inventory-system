package com.loper.inventory_system;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    // CREATE items
    public Item createItem(@Valid @RequestBody Item item) {
        return itemService.saveItem(item);
    }

    @GetMapping
    // READ items
    public List<Item> getItems() {
        return itemService.getItems();
    }

    @DeleteMapping("/{id}")
    // DELETE items
    public void deleteItem(@PathVariable Long id) {
        itemService.deleteItem(id);
    }

    @PutMapping("/{id}")
    // UPDATE items
    public Item updateItem(@PathVariable Long id, @Valid @RequestBody Item item) {
        return itemService.updateItem(id, item);
    }
}
