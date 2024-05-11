import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input scores for three subjects
        System.out.println("Enter the score for Subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.println("Enter the score for Subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.println("Enter the score for Subject 3: ");
        int subject3 = scanner.nextInt();

        // Check if any subject has failed
        if (subject1 < 50 || subject2 < 50 || subject3 < 50) {
            System.out.println("Overall Grade: F (Fail in one or more subjects)");
        } else {
            // Calculate average score
            int averageScore = (subject1 + subject2 + subject3) / 3;

            // Grading logic using switch
            switch (averageScore / 10) {
                case 10:
                case 9:
                    System.out.println("Overall Grade: A");
                    break;
                case 8:
                    System.out.println("Overall Grade: B");
                    break;
                case 7:
                    System.out.println("Overall Grade: C");
                    break;
                case 6:
                    System.out.println("Overall Grade: D");
                    break;
                default:
                    System.out.println("Overall Grade: F");
            }
        }
    }
}