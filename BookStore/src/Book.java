
public class Book {
    private String title;
    private String author;
    private int quantity;
    private Double prices;

    public Book(String title, String author, int quantity, Double prices) {
        this.title = setTitle(title);
        this.author = setAuthor(author);
        this.quantity = setQuantity(quantity);
        this.prices = setPrices(prices);
    }
    public int getQuantity() {
        return quantity;
    }

    public int setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("quantity cannot be negative");
        }
        return this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public String setTitle(String title) {
        if (title.isEmpty()) {
            throw new IllegalArgumentException("cannot be empty");
        }
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String setAuthor(String author) {
        if (author.isEmpty()) {
            throw new IllegalArgumentException("cannot be empty");
        }
        return author;
    }

    public Double getPrices() {
        return prices;
    }

    public Double setPrices(Double prices) {
        if (prices < 0) {
            throw new IllegalArgumentException("prices cannot be negative");
        }
        return this.prices = prices;
    }
    public void addToStock(int quantity) {
        if (this.quantity + quantity < 0) {
            throw new IllegalArgumentException("quantity cannot be negative");
        }
        this.quantity += quantity;
    }
    @Override
    public String toString() {
        return String.format("Title: %s, Author: %s, Price: $%.2f", title, author, prices);
    }
}
