package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest {

    // test
    @Test
    void setUpPassenger() {
        //Passenger p = new Passenger("Mr", "Johhny", "012345678910", "0873212121", 20);
        assertDoesNotThrow(() -> {new Passenger("Mr", "Johhny", "012345678910", "0873212121", 20);});
    }

    @Test
    void testPassengerTitle() {
        assertThrows(IllegalArgumentException.class, () -> {new Passenger("Sir", "Richard", "012345678910", "0871111111", 24);});
    }

    @Test
    void testPassengerName() {
        assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr", "Ri", "012345678910", "0871111111", 24);});
    }

    @Test
    void testPassengerID() {
        assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr", "Richard", "d2315", "0871111111", 24);});
    }

    @Test
    void testPassengerPhone() {
        assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr", "Richard", "012345678910", "08711", 24);});
    }

    @Test
    void testPassengerAge() {
        assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr", "Richard", "012345678910", "0871111111", 15);});
    }

}
