package com.endava.amcourse.person;

import com.endava.amcourse.train.Luggage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Passenger extends Person {

    private Luggage luggage;

    public Passenger(String name, int age, Gender gender, Luggage luggage) {
        super(name, age, gender);
        this.luggage = luggage;
    }

    @Override
    public String toString() {
        return "\n\t\tPassenger{" + super.toString() +
                " ,luggage=" + luggage +
                '}';
    }
}
