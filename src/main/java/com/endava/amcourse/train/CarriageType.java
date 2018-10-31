package com.endava.amcourse.train;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public enum CarriageType {

    RESTAURANT("Restaurant and Kitchen", 60),
    SLEEPER("Sleeper", 20),
    FIRST_CLASS("First class", 30),
    SECOND_CLASS("Second class", 50);

    private String description;
    private int numberOfSeats;
}
