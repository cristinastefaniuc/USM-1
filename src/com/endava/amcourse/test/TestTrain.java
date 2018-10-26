package com.endava.amcourse.test;

import com.endava.amcourse.person.Gender;
import com.endava.amcourse.person.Person;
import com.endava.amcourse.train.Train;

import java.util.Collections;

public class TestTrain {

    public static void main(String[] args) {
        new Train("MD-001", "Moscow", Collections.emptyList(), new Person("Vasea", 56, Gender.MALE));
    }
}
