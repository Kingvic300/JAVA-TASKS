import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {
    @Test
    public void testShoppingCart() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addBookToCart("Embrace", "jack", 10, 15.99);
        assertEquals(1,shoppingCart.getNumber());
    }
    @Test
    public void testRemoveBookFromCart() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addBookToCart("Embrace", "jack", 10, 15.99);
        shoppingCart.removeBookFromCart("Embrace");
        assertEquals(0,shoppingCart.getNumber());
    }
    @Test
    public void testViewCart(){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addBookToCart("Embrace", "jack", 10, 15.99);
        shoppingCart.addBookToCart("Embrace", "jack", 10, 15.99);
        shoppingCart.viewCart();
        assertEquals(20,shoppingCart.getNumber());
    }
    @Test
    public void testClearCart() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addBookToCart("Embrace", "jack", 10, 15.99);
        shoppingCart.clearCart();
        assertEquals(0,shoppingCart.getNumber());
    }


}