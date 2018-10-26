package com.endava.amcourse.train;

import com.endava.amcourse.person.Person;

import java.util.List;

public class Carriege {

    private int number;
    private int numberOfSeats;
    private List<Person> passengers;
    private CarriegeClass carriegeClass;

    public Carriege(int number, int numberOfSeats, List<Person> passengers, CarriegeClass carriegeClass) {
        this.number = number;
        this.numberOfSeats = numberOfSeats;
        this.passengers = passengers;
        this.carriegeClass = carriegeClass;
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

    public CarriegeClass getCarriegeClass() {
        return carriegeClass;
    }

    public void setCarriegeClass(CarriegeClass carriegeClass) {
        this.carriegeClass = carriegeClass;
    }

    @Override
    public String toString() {
        return "Carriege{" +
                "number=" + number +
                ", numberOfSeats=" + numberOfSeats +
                ", passengers=" + passengers +
                ", carriegeClass=" + carriegeClass +
                '}';
    }
}
