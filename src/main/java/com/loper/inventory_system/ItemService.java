package com.loper.inventory_system;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    public List<Item> getItems() {
        return itemRepository.findAll();
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }

    public Item updateItem (Long id, Item newItemDetails) {
        Item existingItem = itemRepository.findById(id).orElse(null);

        if (existingItem != null) {
            existingItem.setName(newItemDetails.getName());
            existingItem.setQuantity(newItemDetails.getQuantity());
            existingItem.setPrice(newItemDetails.getPrice());

            return itemRepository.save(existingItem);
        }
        return null;
    }
}
