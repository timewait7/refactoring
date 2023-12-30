package com.tw.refactoring.composingmethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubstituteAlgorithm {

    String foundPerson(String[] people){
        List<String> candidates = Arrays.asList("Don", "John", "Kent");
        for (int i = 0; i < people.length; i++) {
            if (candidates.contains(people[i])) {
                return people[i];
            }
        }
        return "";
    }
}
