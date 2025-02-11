import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderID;
    private Customer customer;
    private Payment payment;
    private String orderDate;
    private static List<Book> books = new ArrayList<>();
    private Boolean isPaid;


    public Order(int orderID, Customer customer, String orderDate, List<Book> items) {
        this.orderID = orderID;
        this.customer = customer;
        this.orderDate = orderDate;
        this.isPaid = false;
    }
    public void placeOrder(String customerId) {
       if (customer == null) throw new IllegalStateException("No customer associated");

        double total = calculateTotal();
        this.payment = new Payment(total);

//        displayOrderDetails();
        customer.getCart().clearCart();

    }
    public static double calculateTotal() {
        double total = 0.0;
        for (Book book : books) {
            total += book.getPrices();
        }
        return total;

    }
    private static void display(String message) {
        System.out.println(message);
    }

    public void processPayment() {
        if (isPaid) throw new IllegalStateException("Payment already completed");
        this.isPaid = true;
    }
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

}
