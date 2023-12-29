package com.tw.refactoring.composingmethods;

public class ReplaceTempWithQuery {

    private int quantity;

    private double  itemPrice;

    double calculateTotal() {
        if (basePrice() > 1000) {
            return basePrice() * 0.95;
        } else {
            return basePrice() * 0.98;
        }
    }

    double basePrice() {
        return quantity * itemPrice;
    }
}
