class Book
{
    public String title;
    public String author;
    public int pages;

    public Book(String title, String author, int pages)
    {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        // String s = new String("Java");

        Book book1 = new Book("Dune", "Frank Herbert", 412);

        Book book2 = new Book("Alapítvány", "Asimov", 255);

        book2.pages = 300;

        // System.out.println("Title: " + book1.title);
        System.out.println("Title: " + book2.title);
        System.out.println("Oldalszám: " + book2.pages);
    }
}
