package com.vendingmachine;

public enum ProductType {
    COKE(25),
    PEPSI(35),
    SODA(45);

    // Field
    private final int value;

    // Constructor
    ProductType(int value) { this.value = value; }

    // Method
    public int getValue() { return value; }
}
