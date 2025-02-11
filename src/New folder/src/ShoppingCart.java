import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private static final List<Book> books = new ArrayList<Book>();

    public void addBookToCart(Book book) {
        if(!books.contains(book)) {
            books.add(book);
        }
        throw new IllegalArgumentException("Book already exists in your cart.");
    }
    public void removeBookFromCart(Book book) {
        for(Book items : books) {
            if(items.equals(book)) {
                books.remove(items);
            }
        }
        throw new IllegalArgumentException("Book does not exist in your cart.");

    }
    public void showCart() {
        for(Book book : books) {

        }
    }
}
