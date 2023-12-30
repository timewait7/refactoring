package com.tw.refactoring.movingfeaturesbetweenobjects;

import java.util.Date;

public class IntroduceLocalExtension {

    Date nextDay() {
        return new MfDate().nextDay();
    }
}

/**
 * problem: A utility class doesn't have the method you need, and you can't add these methods to the class
 *
 * solution: create a new class that contain the methods and make it either the child or wrapper of the utility class
 */
class MfDate {
    Date date;

    Date nextDay() {
        return new Date();
    }
}