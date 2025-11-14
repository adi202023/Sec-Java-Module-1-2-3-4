public class ExistsInArray {
    public static boolean exists(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return false;
        }

        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 55, 23, 90, 45, 12};

        System.out.println(exists(arr, 90));
        System.out.println(exists(arr, 100));
    }
}
