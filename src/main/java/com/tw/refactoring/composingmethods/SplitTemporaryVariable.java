package com.tw.refactoring.composingmethods;

public class SplitTemporaryVariable {

    private int height;

    private int width;

    void f() {
        double temp = 2 * (height + width);
        System.out.println(temp);
        temp = height * width;
        System.out.println(temp);
    }
}
