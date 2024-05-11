
/*import java.util.Scanner;

public class postiveOrnegative {
    
    // Static method to check if a number is positive or negative
    static boolean isPositive(int number) {
        if (number >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is positive or negative
        if (isPositive(num)) {
            System.out.println(num + " is a positive number.");
        } else {
            System.out.println(num + " is a negative number.");
        }

        scanner.close(); //the program closes the scanner object to release system resources
}
}*/
/*import java.util.Scanner;

public class postiveOrnegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Approach 1: Using if-else statements
        if(number > 0) {
            System.out.println("Number is positive");
        } else if(number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
        
        // Approach 2: Using ternary operator
        String type = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
        System.out.println("Number is " + type);
        }
}*/
public class postiveOrnegative {
    public static void main(String[] args) {
        double negativeNumber = -10.5;
        double positiveNumber = 7.8;
        double zero = 0.0;

        System.out.println("Signum of " + negativeNumber + ": " + Math.signum(negativeNumber));
        System.out.println("Signum of " + positiveNumber + ": " + Math.signum(positiveNumber));
        System.out.println("Signum of " + zero + ": " + Math.signum(zero));
    }
}