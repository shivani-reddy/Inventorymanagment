package com.example.inventorymanagment.service;

import com.example.inventorymanagment.model.Item;
import com.example.inventorymanagment.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

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
}
