public class CopyArray {
    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null; // handle null input
        }

        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] copied = copyArray(arr);

        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.print("\nCopied array:   ");
        for (int num : copied) {
            System.out.print(num + " ");
        }
    }
}
