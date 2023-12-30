package com.tw.refactoring.movingfeaturesbetweenobjects;

import java.util.Date;

public class IntroduceForeignMethod {
}

class Report {
    private Date previousEnd;

    void sendReport() {
        Date nextDay = new Date(previousEnd.getYear(),
                previousEnd.getMonth(), previousEnd.getDate() + 1);
        // ...
    }
}
