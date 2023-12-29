package com.tw.refactoring.composingmethods;

public class ReplaceTempWithQuery {

    private int quantity;

    private double  itemPrice;

    double calculateTotal() {
        // a temp for later use
        final double basePrice = quantity * itemPrice;
        if (basePrice > 1000) {
            return basePrice * 0.95;
        } else {
            return basePrice * 0.98;
        }
    }
}
