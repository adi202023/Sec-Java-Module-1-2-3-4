public class SquareArr {
    public static void main(String[] args) {
        int[] squares = new int[10];  // array of size 10

        // Fill array with squares of numbers 1 to 10
        for (int i = 0; i < squares.length; i++) {
            squares[i] = (i + 1) * (i + 1);
        }

        // Print the array elements
        System.out.println("Squares of numbers 1 to 10:");
        for (int i = 0; i < squares.length; i++) {
            System.out.println("Square of " + (i + 1) + " = " + squares[i]);
        }
    }
}

