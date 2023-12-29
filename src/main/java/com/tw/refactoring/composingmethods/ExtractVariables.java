package com.tw.refactoring.composingmethods;

public class ExtractVariables {

    private String platform;

    private String browser;

    private Integer resize;

    void renderBanner() {
        final boolean isMaxOs = platform.toUpperCase().contains("MAC");
        final boolean isIE = browser.toUpperCase().contains("IE");
        final boolean wasResized = resize > 0;

        // expression is complicated
        if (isMaxOs && isIE && wasInitialized() && wasResized ) {
            // do something
        }
    }

    boolean wasInitialized() {
        return true;
    }
}
