package com.example.inventorymanagment.service;

import com.example.inventorymanagment.exceptionhandling.ResourceNotFoundException;
import com.example.inventorymanagment.model.Item;
import com.example.inventorymanagment.repo.ItemRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ItemServiceTest {
    @Mock
    private ItemRepository itemRepo;

    @InjectMocks
    private ItemService itemservice;

    private Item mockitem;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mockitem=new Item(1,"product8",40);
        mockitem.setItemId(1);

    }

    @Test
    void getAllItems() {
        when(itemRepo.findAll()).thenReturn(Arrays.asList(mockitem));
        assertEquals(1,itemservice.getAllItems().size());
        verify(itemRepo,times(1)).findAll();
    }

    @Test
    void addItem() {
        when(itemRepo.save(any(Item.class))).thenReturn(mockitem);

        Item savedItem = itemservice.addItem(mockitem);
        assertEquals(mockitem.getItemName(), savedItem.getItemName());
        verify(itemRepo, times(1)).save(any(Item.class));
    }

    @Test
    void deleteItem() {
        when(itemRepo.findById(1L)).thenReturn(Optional.empty());

        assertThrows(ResourceNotFoundException.class, () -> {
            itemservice.deleteItem(1L);
        });
    }
}