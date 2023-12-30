package com.tw.refactoring.movingfeaturesbetweenobjects;

public class HideDelegate {

    String getDepartmentManager() {
        final Person1 person1 = new Person1();
        final Department department = person1.getDepartment();
        return department.getManager();
    }
}

class Person1 {
    Department getDepartment() {
        return new Department();
    }
}

class Department {

    String getManager() {
        return "";
    }
}
