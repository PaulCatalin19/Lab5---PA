import java.io.Serializable;

public class Book extends Item implements Serializable {

    public Book(String id, String title, String location, int year, String author, String description) {
        super(id, title, location, year, author, description);
    }

    public Book(String id, String title, String location, int year, String author) {
        super(id, title, location, year, author);
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{}";
    }
}
