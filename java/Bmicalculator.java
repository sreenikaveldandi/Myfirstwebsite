// BMI Calculator
// Problem Description - 

// Given the height (A) and weight (B) of a person as input in centimetres and kilograms.

// Find the BMI of that person and the classification of the user based on their BMI.

// Print Underweight if BMI < 18.5
// Print Normal if BMI lies in the range [18.5, 24.9]
// Print Overweight if BMI lies in the range (24.9, 29.9]
// Print Obese if BMI is greater than 29.9
// If x is the weight in kilograms and y is the height in metres.

// Then, BMI is calculated as x/(y*y).

//  Note: Use round(BMI,1) to get only one digit after decimal

// Problem Constraints -

// 1 <= A <= 180

// 1 <= B <= 120

// Input Format -

// The first line contains the height of the person in centimetres.

// The second line of the input contains the weight of the person in kilograms.

// Output Format -

// The first line of the output contains the classification of a person based on the BMI value.

// The second line of the output contains the BMI value of the person having only one digit after decimal.


import java.util.Scanner;

public class Bmicalculator {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();  // Height in centimeters
        int B = sc.nextInt();  // Weight in kilograms
        
        // Convert height from centimeters to meters
        double heightInMeters = A / 100.0;
        
        // Calculate BMI
        double BMI = B / (heightInMeters * heightInMeters);
        
        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Normal");
        } else if (BMI > 24.9 && BMI <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        
        // Print BMI with one decimal place
        String format = String.format("%.1f", BMI);
        System.out.println(format);
    }
}
