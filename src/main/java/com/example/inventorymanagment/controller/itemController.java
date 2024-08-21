package com.example.inventorymanagment.controller;

import com.example.inventorymanagment.model.Item;
import com.example.inventorymanagment.service.itemService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/items")
public class itemController {
    private itemService itemservice;

    @GetMapping
    public List<Item> getItem(){
        return itemservice.getAllItems() ;
    }

    //@PostMapping
    //public Item addItem(@RequestBody Item item) {
        //return itemService.addItem(item);
    //}

}
