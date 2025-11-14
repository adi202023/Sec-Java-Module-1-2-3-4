public class FindMin {
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {10, 55, 23, 90, 45, 12};
        System.out.println("Minimum element: " + findMin(arr));
    }
}
