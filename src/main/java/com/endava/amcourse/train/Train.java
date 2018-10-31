package com.endava.amcourse.train;

import com.endava.amcourse.person.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Train {

    private String name;
    private City destination;
    private List<Carriage> carriages;
    private Person driver;

    @Override
    public String toString() {
        return "Train{" +
                "name='" + name + '\'' +
                ", destination=" + destination +
                ", carriages=" + carriages +
                ", \ndriver=" + driver +
                '}';
    }
}
