package com.tw.refactoring.composingmethods;

public class RemoveAssignmentsToParameters {

    int discount(int inputVal, int quantity) {
        int result = quantity;
        if (result > 50) {
            result -= 2;
        }
        // ...
        return 0;
    }
}
