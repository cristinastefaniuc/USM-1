package com.endava.amcourse.person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@NoArgsConstructor
@Getter
public class Person {

    public static final int LEGAL_AGE = 18;
    public static final int MIN_AGE = 0;
    public static final int MAX_AGE = 120;

    private String name;
    private int age;
    private Gender gender;

    public Person(String name, int age, Gender gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public void setName(String name) {
        if (Objects.nonNull(name) && name.length() > 1) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age >= MIN_AGE && age <= MAX_AGE) {
            this.age = age;
        }
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static List<Person> filterPersonsByGenderAndAge(List<Person> personList, Gender gender, int age) {
        return personList.stream()
                .filter(person -> person.gender == gender && person.age >= age)
                .collect(Collectors.toList());
    }

    public static List<Person> filterPersonsByGenderAndAgeOldStyle(List<Person> personList, Gender gender, int age) {
        // old implementation would be
        List<Person> filteredPersonList = new ArrayList<>();
        for (Person person : personList) {
            if (person.gender == gender && person.age >= age) {
                filteredPersonList.add(person);
            }
        }
        return filteredPersonList;
    }

    @Override
    public String toString() {
        return "\'" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender;
    }
}
