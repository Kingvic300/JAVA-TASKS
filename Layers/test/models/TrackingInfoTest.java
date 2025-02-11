package data.models;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TrackingInfoTest {
    @Test
    public void getInfo() {
        TrackingInfo trackingInfo = new TrackingInfo(1234,"food");
        assertEquals("food", trackingInfo.getInfo());
    }

    @Test
    public void getItemId() {
        TrackingInfo trackingInfo = new TrackingInfo(1234,"food");
        assertEquals(1234, trackingInfo.getItemId());
    }
}
