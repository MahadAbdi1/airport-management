package za.ac.cput.domain.entity;

/*
 * Author : Adecel Rusty Mabiala
 * Student Number : 219197229
 * Assessment 01 (Term1)
 * */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportManagementTest {
    @Test
    public void test() {
        AirportManagement airportM = new AirportManagement.Builder().setAirportName("MayaMaya")
                .setCityName("Brazzaville").setArea("Center of Africa").build();

        System.out.println(airportM);
    }
}