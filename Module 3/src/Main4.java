class Cylinder {

    // Private properties
    private double radius;
    private double height;

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Method to calculate volume of cylinder: πr²h
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    // Method to calculate surface area: 2πr(h + r)
    public double surfaceArea() {
        return 2 * Math.PI * radius * (height + radius);
    }
}

public class Main4 {
    public static void main(String[] args) {

        Cylinder c = new Cylinder();

        // Set radius and height
        c.setRadius(7);
        c.setHeight(10);

        // Print radius and height
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Height: " + c.getHeight());

        // Calculate and print volume and surface area
        System.out.println("Volume of Cylinder: " + c.volume());
        System.out.println("Surface Area of Cylinder: " + c.surfaceArea());
    }
}