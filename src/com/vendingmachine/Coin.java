package com.vendingmachine;

public class Coin {
    int value; // monetary value

    public static CoinType getCoinType(int value) {
        for (CoinType t : CoinType.values()) {
            if (t.getValue() == value) {
                return t;
            }
        }
        System.err.println("Invalid coin");
        return null;
    }
}
