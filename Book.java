public class Book {
    public String title;
    public int numPages;

    public Book(String t, int n) {
        this.title = t;
        this.numPages = n;
    }

    public void printBook() {
        System.out.println("The book " + title + " is " + numPages + " pages long.");
    }
}
