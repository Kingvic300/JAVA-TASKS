package codingChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZonesTest {

    @Test
    public void testNorthZones() {
        String state = "FCT";
        String answer = Zones.findZone(state);
        String expected = "NORTHCENTRAL";
        assertEquals(answer, expected);
    }
    @Test
    public void testSouthZones() {
        String state = "Enugu";
        String answer = Zones.findZone(state);
        String expected = "SOUTHEAST";
        assertEquals(answer, expected);
    }
}
