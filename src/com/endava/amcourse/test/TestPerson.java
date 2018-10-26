package com.endava.amcourse.test;

import com.endava.amcourse.person.Person;

import java.util.Arrays;
import java.util.List;

import static com.endava.amcourse.person.Gender.FEMALE;
import static com.endava.amcourse.person.Gender.MALE;
import static com.endava.amcourse.utils.PrintUtils.printDelimiter;

public class TestPerson {

    public static void main(String[] args) {

        // test filterPersonsByGenderAndAge method from Person
        List<Person> students = Arrays.asList(
                new Person("Vasea", 33, MALE),
                new Person("Ann", 18, FEMALE),
                new Person("Petru", 28, MALE),
                new Person("Olga", 22, FEMALE)
        );

        printDelimiter('*');

        System.out.println(Person.filterPersonsByGenderAndAge(students, MALE, Person.LEGAL_AGE));
        System.out.println(Person.filterPersonsByGenderAndAge(students, FEMALE, Person.LEGAL_AGE));
    }
}
