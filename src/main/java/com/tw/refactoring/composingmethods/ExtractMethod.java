package com.tw.refactoring.composingmethods;

public class ExtractMethod {

    private String name;

    void printOwing() {
        printBanner();

        // Print Details
        System.out.println("name: " + name);
        System.out.println("amount: " + getOutstanding());
    }

    void printBanner() {

    }

    String getOutstanding() {
        return "";
    }
}
