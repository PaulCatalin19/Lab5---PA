import java.io.Serializable;

public class Article extends Item implements Serializable {

    public Article(String id, String title, String location, int year, String author, String description) {
        super(id, title, location, year, author, description);
    }

    public Article(String id, String title, String location, int year, String author) {
        super(id, title, location, year, author);
    }

    public Article() {
    }

    @Override
    public String toString() {
        return "Article{}";
    }
}
