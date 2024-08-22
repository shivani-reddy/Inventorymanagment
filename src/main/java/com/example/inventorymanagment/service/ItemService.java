package com.example.inventorymanagment.service;

import com.example.inventorymanagment.exceptionhandling.ResourceNotFoundException;
import com.example.inventorymanagment.model.Item;
import com.example.inventorymanagment.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepo;

    public List<Item> getAllItems() {
        return itemRepo.findAll();
    }

   public  Item addItem(Item item) {
      return itemRepo.save(item);
    }
    public Optional<Item> getItemById(Long id){
        return itemRepo.findById(id);
    }
    public void deleteItem(Long id){
        Item item = itemRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));
         itemRepo.deleteById(id);
    }
}
