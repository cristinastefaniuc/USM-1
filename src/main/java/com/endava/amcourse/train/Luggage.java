package com.endava.amcourse.train;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Luggage {

    private int volume;

    @Override
    public String toString() {
        return "Luggage{" +
                "volume=" + volume +
                '}';
    }
}
