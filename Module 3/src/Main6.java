class Rectangle {

    private int length;
    private int breadth;

    // Default constructor (fixed values)
    Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    // Parameterized constructor (custom values)
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to print rectangle dimensions
    void printDimensions() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println();
    }
}

public class Main6 {
    public static void main(String[] args) {

        // Using default constructor
        Rectangle r1 = new Rectangle();
        System.out.println("Default Rectangle:");
        r1.printDimensions();

        // Using parameterized constructor
        Rectangle r2 = new Rectangle(10, 20);
        System.out.println("Custom Rectangle:");
        r2.printDimensions();
    }
}