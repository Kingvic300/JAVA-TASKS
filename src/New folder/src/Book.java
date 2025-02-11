import java.util.ArrayList;
import java.util.List;

public class Book {
    private static List<Book> books = new ArrayList<>();
    private String title;
    private String author;
    private String Genres;

    public Book(String title, String author, String Genres) {
        this.title = title;
        this.author = author;
        this.Genres = Genres;
    }
    private void Books() {
        books.add(new Book("Murder on the orient Express","Victor","mystery"));
        books.add(new Book("Murder on the orient Express","Victor","mystery"));
        books.add(new Book("Murder on the orient Express","Victor","mystery"));
        books.add(new Book("Murder on the orient Express","Victor","mystery"));
        books.add(new Book("Murder on the orient Express","Victor","mystery"));
        books.add(new Book("Murder on the orient Express","Victor","mystery"));
        books.add(new Book("Murder on the orient Express","Victor","mystery"));
        books.add(new Book("Murder on the orient Express","Victor","mystery"));
        books.add(new Book("Murder on the orient Express","Victor","mystery"));
        books.add(new Book("Murder on the orient Express","Victor","mystery"));
        books.add(new Book("Murder on the orient Express","Victor","mystery"));
    }
    public String searchBooks(){
        for(Book book : books){
            if(book.title.equals(this.title)){
                return title;
            }
        }
        throw new IllegalArgumentException("Book not found");
    }
}
