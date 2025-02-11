package data.models;

import static org.junit.Assert.assertEquals;

public class ItemTest {
    @org.junit.jupiter.api.Test
    public void getId() {
        Item item = new Item(1234,"yam","food",234);
        assertEquals(1234,item.getId());
    }

    @org.junit.jupiter.api.Test
    public void getName() {
        Item item = new Item(1234,"yam","food",234);
        assertEquals("yam",item.getName());
    }

    @org.junit.jupiter.api.Test
    public void getDescription() {
        Item item = new Item(1234,"yam","food",234);
        assertEquals("food",item.getDescription());
    }

    @org.junit.jupiter.api.Test
    public void getWeightInGrams() {
        Item item = new Item(1234,"yam","food",234);
        assertEquals(234,item.getWeightInGrams());
    }
}
