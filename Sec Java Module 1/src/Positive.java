import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        if(n>0) {
            System.out.print("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }
    }
}
