package com.tw.refactoring.movingfeaturesbetweenobjects;

import java.util.Date;

public class IntroduceForeignMethod {
}

class Report {
    private Date previousEnd;

    void sendReport() {
        // what is the difference between 'Extract Method' with 'Introduce Foreign Method'
        Date nextDay = nextDay(previousEnd);
        // ...
    }

    private static Date nextDay(Date aDate) {
        return new Date(aDate.getYear(), aDate.getMonth(), aDate.getDate() + 1);
    }
}
