import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        if(a>b){
            System.out.println(a +" is greatest number:");
        }
        else{
            System.out.println(b +" is greatest number");
        }
    }
}
