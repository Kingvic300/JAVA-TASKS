import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {
    @Test
    public void testCustomerCanGetName() {
        Customer customer = new Customer("Victor",1234);
        assertEquals("Victor",customer.getName());
    }
    @Test
    public void testCustomerCanGetId() {
        Customer customer = new Customer("Victor",1234);
        assertEquals(1234,customer.getID());
    }


}