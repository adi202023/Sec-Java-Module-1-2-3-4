import java.util.Scanner;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class EmailValidation {

    static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Invalid Email: '@' symbol missing.");
        }
        System.out.println("Valid Email");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your email: ");
            String email = sc.nextLine();
            validateEmail(email);

        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

