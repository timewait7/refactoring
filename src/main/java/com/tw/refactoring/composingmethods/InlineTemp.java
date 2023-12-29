package com.tw.refactoring.composingmethods;

public class InlineTemp {

    boolean hasDiscount(Order order) {
        final double basePrice = order.basePrice();
        return basePrice > 1000;
    }
}

class Order {
    double basePrice() {
        return 0.0;
    }
}
