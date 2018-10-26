package com.endava.amcourse.train;

public enum CarriegeClass {

    RK("Restaurant and Kitchen"),
    SL("Sleeper"),
    FC("First class"),
    SC("Second class");

    private String description;

    CarriegeClass(String description) {
        this.description = description;
    }
}
