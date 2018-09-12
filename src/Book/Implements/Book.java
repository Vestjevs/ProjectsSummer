package Book.Implements;


public class Book {
    protected String title;
    protected String author;
    protected int PublicationDate;

    public Book(String t, String a, int pD) {
        title = t;
        author = a;
        PublicationDate = pD;
    }

    void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(PublicationDate);
        System.out.println();
    }

}
