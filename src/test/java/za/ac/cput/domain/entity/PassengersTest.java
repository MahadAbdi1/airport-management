package za.ac.cput.domain.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//219383448 KISSIMBA NYEMBO ISAAC

class PassengersTest {
    @Test
    public void test(){
        Passengers passengers = new Passengers.Builder().setPassengerID("219383664")
                .setPassengerFirstName("JONATHAN")
                .setPassengerLastName("KUMINGA")
                .setPassengerAge("20")
                .build();
        System.out.println(passengers);

    }

}