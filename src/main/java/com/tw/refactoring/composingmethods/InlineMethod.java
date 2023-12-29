package com.tw.refactoring.composingmethods;

public class InlineMethod {

    private int numberOfLateDeliveries;

    int getRating() {
        return numberOfLateDeliveries > 5 ? 2 : 1;
    }
}