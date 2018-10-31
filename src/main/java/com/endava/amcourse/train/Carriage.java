package com.endava.amcourse.train;

import com.endava.amcourse.person.Person;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Carriage {

    private int number;
    private CarriageType carriageType;
    private List<Person> passengers;

    @Override
    public String toString() {
        return "\n\tCarriage{" +
                "number=" + number +
                ", passengers=" + passengers +
                ", carriageType=" + carriageType +
                "}";
    }
}
