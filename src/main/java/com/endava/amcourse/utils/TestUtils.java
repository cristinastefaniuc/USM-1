package com.endava.amcourse.utils;

import com.endava.amcourse.person.Gender;
import com.endava.amcourse.person.Passenger;
import com.endava.amcourse.person.Person;
import com.endava.amcourse.train.*;

import java.security.SecureRandom;
import java.util.*;

import static java.util.Arrays.*;

public class TestUtils {

    private static Random random = new SecureRandom();

    private static Map<Gender, List<String>> genderListMap = new EnumMap<>(Gender.class);

    private static String[] femaleNames = {"Anna", "Tatiana", "Cristina", "Natalia"};
    private static String[] maleNames = {"Andrei", "Mihail", "Nicolae", "Alex"};

    static {
        genderListMap.put(Gender.MALE, asList(maleNames));
        genderListMap.put(Gender.FEMALE, asList(femaleNames));
    }

    public static void printDelimiter(char delimiter) {
        String line = "";
        for (int i = 0; i < 150; i++) {
            line = line.concat(Character.toString(delimiter));
        }
        System.out.println(line);
    }

    public static Carriage createCarriage() {
        CarriageType carriageType = CarriageType.values()[random.nextInt(CarriageType.values().length)];

        List<Person> passengers = new ArrayList<>();
        for (int i = 0; i < random.nextInt(carriageType.getNumberOfSeats()); i++) {
            passengers.add(createPassenger());
        }

        return new Carriage(random.nextInt(12), carriageType, passengers);
    }

    public static Train createTrain() {

        List<Carriage> carriages = new ArrayList<>();
        for (int i = 1; i < random.nextInt(10); i++) {
            carriages.add(createCarriage());
        }

        return new Train("MD-" + random.nextInt(100),
                City.values()[random.nextInt(City.values().length)],
                carriages,
                new Person("Vasea", 54, Gender.MALE));
    }

    public static Passenger createPassenger() {
        Gender randomGender = Gender.values()[random.nextInt(2)];
        return new Passenger(genderListMap.get(randomGender).get(random.nextInt(genderListMap.get(randomGender).size())), random.nextInt(Person.MAX_AGE), randomGender, new Luggage(30));
    }
}
