package com.tw.refactoring.composingmethods;

public class RemoveAssignmentsToParameters {

    int discount(int inputVal, int quantity) {
        if (quantity > 50) {
            inputVal -= 2;
        }
        // ...
        return 0;
    }
}
