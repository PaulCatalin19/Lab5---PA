import java.io.IOException;

public class Main {

    public static void main(String[] args){

        Main app = new Main();
        app.testCreateSave();
        app.testLoadView();
    }

    private void testCreateSave() {
        Catalog catalog =
                new Catalog("MyRefs");
        var book = new Book("knuth67", "The Art of Computer Programming","d:/books/programming/tacp.ps"
                ,1967, "Donald E. Knuth", "amazing");
        var article = new Article("java17", "The Java Language Specification"
                ,"https://docs.oracle.com/javase/specs/jls/se17/html/index.html",2021,
                "James Gosling & others" ,"ds");
        var book1 = new Book ("it1","titlu","d:/books/programming/tacp.ps",12,"Ionut","amazing");
        catalog.add(book);
        catalog.add(article);
        catalog.add(book1);

       try {
           CatalogUtil.save(catalog, "D:\\Facultate An 2, Sem 2\\3. Programare avansata\\Laboratoare\\LAB5\\New folder\\catalog.json");
       } catch (IOException e) {
           System.out.println(e);
       }
    }

    private void testLoadView() {
        try {
            Catalog catalog = CatalogUtil.load("D:\\Facultate An 2, Sem 2\\3. Programare avansata\\Laboratoare\\LAB5\\New folder\\catalog.json");
        }
        catch (InvalidCatalogException exception){
            System.out.println(exception);
        }

//        CatalogUtil.view(catalog.findById("article1"));
    }

}
