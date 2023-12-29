package com.tw.refactoring.composingmethods;

public class ExtractVariables {

    private String platform;

    private String browser;

    private Integer resize;

    void renderBanner() {
        // expression is complicated
        if ((platform.toUpperCase().contains("MAC")) &&
                (browser.toUpperCase().contains("IE")) &&
                wasInitialized() && resize > 0 )
        {
            // do something
        }
    }

    boolean wasInitialized() {
        return true;
    }
}
