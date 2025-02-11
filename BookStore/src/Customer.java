import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Customer {
    private String name;
    private int iD;
    private ShoppingCart cart = new ShoppingCart();
    private Order orders;
    private static List<Book> items = new ArrayList<Book>();
    private static List<Order> orderHistory = new ArrayList<>();
    private static List<Integer> iDs = new ArrayList<>();


    public Customer(String name, ShoppingCart cart) {
        this.name = name;
        this.iD = setID();
        this.cart = cart;
    }
    public String getName() {
        if(this.name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        return this.name;
    }
    public int getID() {
        return iD;
    }
    public int setID() {
        Random random = new Random();
        int newId;
        do{
            newId = 1000+random.nextInt(9000);
        }while (iDs.contains(newId));
            iDs.add(newId);
        return this.iD = newId;
    }
    public ShoppingCart getCart() {
        return cart;
    }


    public Book searchBookByName(String title) {
        for(Book books : items){
            if(books.getTitle().equals(title)){
                return books;
            }
        }
        throw new IllegalArgumentException("Book not found");
    }
    public static List<Order> getOrderHistory() {
        return orderHistory;
    }
    public void addToOrderHistory(Order order) {
        orderHistory.add(order);
    }
    public void login(String username, String password) {

    }

}
