public class CountOccurences {
    public static int countOccurrences(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return 0; // if array is empty or null, occurrences = 0
        }

        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 20, 50};
        int target = 20;

        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nOccurrences of " + target + ": " + countOccurrences(arr, target));
    }
}
