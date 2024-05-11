// Problem Description
// Given three integers, A, B and C. You have to find the number of days it will take to reach zero cases of Corona in a city.

// A - Average cases recovered in a day of the corona.
// B - Number of new cases of corona daily.
// C - Current active cases of the corona.

// Return the minimum number of days it will take to reach 0 active cases of Covid.
public class corona {
    public static int daysToZeroCases(int A, int B, int C) {
        int days = 0;
        
        while (C > 0) { // Keep looping until there are zero active cases
            C -= A;     // Number of active cases decreases by the cases recovered
            C += B;     // Number of active cases increases by the new cases reported
            days++;     // Increment the number of days
            
            // If the number of active cases becomes negative, set it to zero
            if (C < 0) {
                C = 0;
            }
        }
        
        return days;
    }

    public static void main(String[] args) {
        int A = 5; // Example: 5 people recover per day
        int B = 3; // Example: 3 new cases reported per day
        int C = 1; // Example: 1 current active cases
        
        int days = daysToZeroCases(A, B, C);
        System.out.println("Number of days to reach zero cases: " + days);
    }
}
