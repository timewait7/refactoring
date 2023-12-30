package com.tw.refactoring.composingmethods;

public class ReplaceMethodWithMethodObject {

    // a long method in which the local variables are so intertwined that you can't apply Extract Method
    public double price() {
        return new PriceCalculator(this).compute();
    }
}

/**
 * Transform the method into a separate class so that the local variables
 * become fields of the class. Then you can split the method into several
 * methods within the same class.
 */
class PriceCalculator {
    double primaryBasePrice;
    double secondaryBasePrice;
    double tertiaryBasePrice;

    public PriceCalculator(ReplaceMethodWithMethodObject object) {
        // Copy relevant information from the order object.
    }

    public double compute() {
        // Perform long computation
        return 0.0;
    }
}
