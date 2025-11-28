class Book {
    // Instance variables
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Constructor with title and author only
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0; // default price
    }

    // Constructor with all fields
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to print book details
    void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class Main2 {
    public static void main(String[] args) {

        // Using default constructor
        Book b1 = new Book();
        System.out.println("Default Constructor:");
        b1.printDetails();

        // Using constructor with title & author
        Book b2 = new Book("The Alchemist", "Paulo Coelho");
        System.out.println("Constructor with Title and Author:");
        b2.printDetails();

        // Using constructor with all fields
        Book b3 = new Book("Atomic Habits", "James Clear", 499.00);
        System.out.println("Constructor with All Fields:");
        b3.printDetails();
    }
}