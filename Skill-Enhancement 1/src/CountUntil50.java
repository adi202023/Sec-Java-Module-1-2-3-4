public class CountUntil50 {
    public static void main(String[] args) {
        int[] arr = {10, 55, 23, 78, 90, 47, 55, 12};
        int countGreater = 0;
        for (int num : arr) {
            if (num > 50) {
                countGreater++;
            }
        }
        System.out.println("Numbers greater than 50: " + countGreater);
    }
}
