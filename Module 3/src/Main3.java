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
}

public class Main3 {
    public static void main(String[] args) {

        // Create an object of Cylinder
        Cylinder c = new Cylinder();

        // Use setters
        c.setRadius(7.5);
        c.setHeight(12.3);

        // Use getters
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Height: " + c.getHeight());
    }
}