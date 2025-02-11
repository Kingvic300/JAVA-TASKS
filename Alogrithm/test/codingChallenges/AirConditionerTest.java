package codingChallenges;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {
    @Test
    public void testThatAirConditionerTurnOn() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        boolean result = airConditioner.isOn();
        boolean expected = true;
        assertEquals(expected, result);
    }
    @Test
    public void testThatAirConditionerTurnOff() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOff();
        boolean result = airConditioner.isOn();
        boolean expected = false;
        assertEquals(expected, result);
    }
    @Test
    public void testThatAirConditionerlevel() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        airConditioner.Level(17);
        int result = airConditioner.Level();
        int expected = 17;
        assertEquals(expected, result);
    }
}