class Cylinder {

    // Private properties
    private double radius;
    private double height;

    // Constructor to initialize radius and height
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Method to calculate volume: πr²h
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    // Method to calculate surface area: 2πr(h + r)
    public double surfaceArea() {
        return 2 * Math.PI * radius * (height + radius);
    }
}

public class Main5 {
    public static void main(String[] args) {

        // Create object using constructor
        Cylinder c = new Cylinder(7, 10);

        // Print properties
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Height: " + c.getHeight());

        // Print volume & surface area
        System.out.println("Volume of Cylinder: " + c.volume());
        System.out.println("Surface Area of Cylinder: " + c.surfaceArea());
    }
}