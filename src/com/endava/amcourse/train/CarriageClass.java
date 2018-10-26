package com.endava.amcourse.train;

public enum CarriageClass {

    RK("Restaurant and Kitchen"),
    SL("Sleeper"),
    FC("First class"),
    SC("Second class");

    private String description;

    CarriageClass(String description) {
        this.description = description;
    }
}
