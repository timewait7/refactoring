package com.tw.refactoring.composingmethods;

public class InlineMethod {

    private int numberOfLateDeliveries;

    int getRating() {
        return moreThanFiveLateDeliveries() ? 2 : 1;
    }

    // the method body is more obvious than the method itself
    boolean moreThanFiveLateDeliveries() {
        return numberOfLateDeliveries > 5;
    }
}
