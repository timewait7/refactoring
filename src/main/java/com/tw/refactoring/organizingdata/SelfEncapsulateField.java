package com.tw.refactoring.organizingdata;

public class SelfEncapsulateField {
}

class Range {
    private int low;
    private int high;

    boolean includes(int arg) {
        return arg >= low && arg <= high;
    }
}
