package com.tw.refactoring.composingmethods;

public class SplitTemporaryVariable {

    private int height;

    private int width;

    void f() {
        final int perimeter = 2 * (height + width);
        System.out.println(perimeter);
        final int area = height * width;
        System.out.println(area);
    }
}
