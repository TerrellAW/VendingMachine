package com.vendingmachine;

public class Product {
    int value; // monetary value

    public static ProductType getProductType(int value) {
        for (ProductType t : ProductType.values()) {
            if (t.getValue() == value) {
                return t;
            }
        }
        System.err.println("Invalid product");
        return null;
    }
}
