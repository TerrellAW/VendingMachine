package com.vendingmachine;

import java.util.List;

public interface IVendingMachine {
    // Will verify that coins are valid types and count their value
    int countCoins(List<Coin> coins);
    // Inventory
    int countProducts(List<Product> products);
}
