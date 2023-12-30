package com.tw.refactoring.movingfeaturesbetweenobjects;

public class HideDelegate {

    String getDepartmentManager() {
        final Person1 person1 = new Person1();
        return person1.getManager();
    }
}

class Person1 {
    Department getDepartment() {
        return new Department();
    }

    String getManager() {
        return getDepartment().getManager();
    }
}

class Department {

    String getManager() {
        return "";
    }
}
