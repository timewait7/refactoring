package com.tw.refactoring.composingmethods;

public class ReplaceMethodWithMethodObject {

    // a long method in which the local variables are so intertwined that you can't apply Extract Method
    public double price() {
        double primaryBasePrice;
        double secondaryBasePrice;
        double tertiaryBasePrice;
        // Perform long computation.
        return 0.0;
    }
}
