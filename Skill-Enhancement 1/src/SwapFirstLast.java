public class SwapFirstLast {

    // Method to swap first and last elements of an array
    public static void swapFirstLast(int[] arr) {
        if (arr != null && arr.length > 1) {
            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }
    }

    // Test the method
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        swapFirstLast(arr);

        System.out.print("\nAfter swapping first and last: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
