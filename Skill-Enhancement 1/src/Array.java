public class Array {
    public static void main(String[] args) {
        int[] myArr = {23,42,35,64,13};
        int index = 0;
        while(index<5) {
            System.out.println(myArr[index]);
            index++;
        }
        arr();
    }


    public static int arr(){
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        System.out.println(a[4]);
        return a[4];
    }
}
