package practice2;

public class Example13Book {
    public static String title;
    public static String author;
    public static int price;



    public Example13Book (String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void nameOfTitle(String title) {
        System.out.println(this.title);
    }

    public void nameOfAuthor(String author) {
        System.out.println(this.author);
    }

    public void getPrice(int price) {
        System.out.println(this.price);
    }

    public void dataOfBook() {
        System.out.printf("book name is %s, author is %s, it's %d won.%n", title, author, price);

    }


}
