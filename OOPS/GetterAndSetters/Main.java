package OOPS.GetterAndSetters;

public class Main {
    public static void main(String[] args) {
        Book b = new Book();

        b.setTitle("MAstering JAVA");
        b.setAuthor("Anjali Kumari");
        b.setPrice(499.0);

        b.displayDetails();
    }
}

class Book {
    // Private fields
    private String title;
    private String author;
    private double price;

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    public void displayDetails() {
        System.out.println("Book : " + title + " by " + author + " ( Rs " + price + "/- )");
    }
}