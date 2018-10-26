package com.endava.amcourse.utils;

public class PrintUtils {

    public static void printDelimiter(char delimiter) {
        String line = "";
        for (int i = 0; i < 150; i++) {
            line = line.concat(Character.toString(delimiter));
        }
        System.out.println(line);
    }
}
