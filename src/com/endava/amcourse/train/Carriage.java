package com.endava.amcourse.train;

import com.endava.amcourse.person.Person;

import java.util.List;

public class Carriage {

    private int number;
    private int numberOfSeats;
    private List<Person> passengers;
    private CarriageClass carriageClass;

    public Carriage(int number, int numberOfSeats, List<Person> passengers, CarriageClass carriageClass) {
        this.number = number;
        this.numberOfSeats = numberOfSeats;
        this.passengers = passengers;
        this.carriageClass = carriageClass;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public List<Person> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Person> passengers) {
        this.passengers = passengers;
    }

    public CarriageClass getCarriageClass() {
        return carriageClass;
    }

    public void setCarriageClass(CarriageClass carriageClass) {
        this.carriageClass = carriageClass;
    }

    @Override
    public String toString() {
        return "Carriage{" +
                "number=" + number +
                ", numberOfSeats=" + numberOfSeats +
                ", passengers=" + passengers +
                ", carriageClass=" + carriageClass +
                '}';
    }
}
