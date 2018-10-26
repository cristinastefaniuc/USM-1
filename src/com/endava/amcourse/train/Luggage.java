package com.endava.amcourse.train;

public class Luggage {

    private int volume;
    private String ownerName;

    public Luggage(int volume, String ownerName) {
        this.volume = volume;
        this.ownerName = ownerName;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Luggage{" +
                "volume=" + volume +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
