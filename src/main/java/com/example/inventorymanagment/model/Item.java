package com.example.inventorymanagment.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int itemId;
    String itemName;
    long itemPrice;
}
