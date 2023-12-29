package com.tw.refactoring.composingmethods;

public class ExtractMethod {

    private String name;

    void printOwing() {
        printBanner();
        printDetails(getOutstanding());
    }

    void printBanner() {

    }

    void printDetails(double outstanding) {
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }

    double getOutstanding() {
        return 0.0;
    }
}
