package com.endava.amcourse.test;

import com.endava.amcourse.person.Passenger;
import com.endava.amcourse.person.Person;
import com.endava.amcourse.train.Carriage;
import com.endava.amcourse.train.CarriageType;
import com.endava.amcourse.train.Train;

import java.util.*;

import static com.endava.amcourse.utils.TestUtils.createTrain;
import static com.endava.amcourse.utils.TestUtils.printDelimiter;

public class TestTrain {

    public static void main(String[] args) {

        Train train = createTrain();

        System.out.println(train);
        System.out.println("Total quantity of free places in the train: " + calculateQuantityOfFreePlaces(train));

        printDelimiter('-');
        System.out.println("Passengers of each carriage type: " + getPassengersOfEachCarriageType(train));

        printDelimiter('-');
        System.out.println("Total volume of luggage in the train: " + getTotalVolumeOfLuggageInTheTrain(train));

    }

    public static int calculateQuantityOfFreePlaces(Train train) {
        int totalPlaces = train.getCarriages().stream()
                .mapToInt(carriage -> carriage.getCarriageType().getNumberOfSeats())
                .sum();
        int occupiedPlaces = train.getCarriages().stream()
                .mapToInt(carriage -> carriage.getPassengers().size())
                .sum();

//        old style to count occupiedPlaces
//        for (Carriage carriage : train.getCarriages()) {
//            occupiedPlaces += carriage.getPassengers().size();
//        }

        System.out.println("TOTAL " + totalPlaces);
        System.out.println("OCCUPIED " + occupiedPlaces);

        return totalPlaces - occupiedPlaces;
    }

    public static Map<CarriageType, List<Person>> getPassengersOfEachCarriageType(Train train) {
        Map<CarriageType, List<Person>> carriageTypeListMap = new EnumMap<>(CarriageType.class);
        for (Carriage carriage : train.getCarriages()) {
            if (carriageTypeListMap.containsKey(carriage.getCarriageType())) {
                carriageTypeListMap.get(carriage.getCarriageType()).addAll(carriage.getPassengers());
            } else {
                carriageTypeListMap.put(carriage.getCarriageType(), carriage.getPassengers());
            }
        }
        return carriageTypeListMap;
    }

    public static int getTotalVolumeOfLuggageInTheTrain(Train train) {
        int totalVolume = 0;
        for (Carriage carriage : train.getCarriages()) {
            for (Person person : carriage.getPassengers()) {
                totalVolume += ((Passenger) person).getLuggage().getVolume();
            }
        }
        return totalVolume;
    }

}
