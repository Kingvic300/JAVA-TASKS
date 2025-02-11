package codingChallenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirlineReservationSystemTest {
    @Test
    public void testThatPlaneCapacityIs10Seats(){
        int size = 10;
        ArrayList <Integer> planeCapacity = new ArrayList<>(size) ;
        planeCapacity = AirlineReservationSystem.planeCapacity(planeCapacity);
        ArrayList<Integer> expected = new ArrayList<>(size) ;
        System.out.println(expected);
        assertEquals(planeCapacity,expected);

    }
    @Test
    public void testThatPlanesFirstCLassHasPassengers(){
        int size = 5;
        ArrayList <Integer> planeCapacity = new ArrayList<>(size) ;
        planeCapacity = AirlineReservationSystem.firstClass(planeCapacity);
    }
}
