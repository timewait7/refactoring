package com.tw.refactoring.organizingdata;

public class SelfEncapsulateField {
}

class Range {
    private int low;
    private int high;

    boolean includes(int arg) {
        return arg >= getLow() && arg <= getHigh();
    }

    /**
     * indirect access to the fields is much more flexible
     *
     * first, lazy initialization and validation of fields can be implemented easily in the setters and getters
     * second, you can redefine setters and getters in subclass
     */

    int getLow() {
        return low;
    }

    int getHigh() {
        return high;
    }
}
