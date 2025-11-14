public class PrintEven {
    public static void printEven(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 22, 33, 40, 55};
        printEven(arr);
    }
}
