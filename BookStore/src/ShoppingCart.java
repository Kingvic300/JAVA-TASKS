import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private static final List<Book> items = new ArrayList<Book>();
    private static final List<Book> removeBook = new ArrayList<>();
    private String name;
    private int number;

    public void addBookToCart(String title, String author, int quantity, Double prices){
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be at least 1");
        }
        if(prices <= 0){
            throw new IllegalArgumentException("Price must be at least 1");
        }
        Book books = new Book(title, author, quantity, prices);
        for (int count = 0; count < quantity; count++) {
            items.add(books);
        }
    }
    public void display(){
        System.out.println(items);
    }

    public void removeBookFromCart(String title) {
        for (Book book : items) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                removeBook.add(book);
            }else {
                throw new IllegalArgumentException("Book does not exist");
            }
        }
        items.removeAll(removeBook);
    }
    public void viewCart() {
        for (Book item : items) {
            System.out.println("Title: "+item.getTitle()+"      "+"Author: "+item.getAuthor()+"     "+"Price: "+item.getPrices());
        }
    }
    public List<Book> getItems() {
        return items;
    }
    public void clearCart() {
        items.clear();
    }
    public String getName() {
        return name;
    }
    public int getNumber(){
       return number = items.size();
    }
}
