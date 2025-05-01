package com.vendingmachine;

public enum CoinType { // in Java enums are pretty much classes
    // Each constant is tied to a value
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25);

    // This and the constructor below allow each constant to have its own value
    private final int value;

    // Constructor
    CoinType(int value) {
        this.value = value;
    }

    // Method
    public int getValue() {
        return value;
    }
}
