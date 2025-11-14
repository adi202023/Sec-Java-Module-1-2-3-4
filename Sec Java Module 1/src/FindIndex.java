public class FindIndex {
    public static void printIndex(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Number " + target + " found at index " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Number " + target + " not found in array.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 55, 23, 90, 45, 90, 12};
        int target = 90;

        printIndex(arr, target);
    }
}
