package com.endava.amcourse.train;

import com.endava.amcourse.person.Person;

import java.util.List;

public class Train {

    private String name;
    private String destination;
    private List<Carriege> carrieges;
    private Person driver;

    public Train(String name, String destination, List<Carriege> carrieges, Person driver) {
        this.name = name;
        this.destination = destination;
        this.carrieges = carrieges;
        this.driver = driver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<Carriege> getCarrieges() {
        return carrieges;
    }

    public void setCarrieges(List<Carriege> carrieges) {
        this.carrieges = carrieges;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }
}
