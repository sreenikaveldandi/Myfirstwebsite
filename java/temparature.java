import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature;
        
        System.out.print("Enter temperature: ");
        temperature = scanner.nextDouble();
        
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Fahrenheit to Kelvin");
        System.out.println("4. Kelvin to Fahrenheit");
        System.out.println("5. Celsius to Kelvin");
        System.out.println("6. Kelvin to Celsius");
        System.out.println("7. Celsius to Réaumur");
        System.out.println("8. Réaumur to Celsius");
        
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temperature));
                break;
            case 2:
                System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temperature));
                break;
            case 3:
                System.out.println("Temperature in Kelvin: " + fahrenheitToKelvin(temperature));
                break;
            case 4:
                System.out.println("Temperature in Fahrenheit: " + kelvinToFahrenheit(temperature));
                break;
            case 5:
                System.out.println("Temperature in Kelvin: " + celsiusToKelvin(temperature));
                break;
            case 6:
                System.out.println("Temperature in Celsius: " + kelvinToCelsius(temperature));
                break;
            case 7:
                System.out.println("Temperature in Réaumur: " + celsiusToReaumur(temperature));
                break;
            case 8:
                System.out.println("Temperature in Celsius: " + reaumurToCelsius(temperature));
                break;
            default:
                System.out.println("Invalid choice.");
        }
        
        scanner.close();
    }
    
    // Fahrenheit to Celsius conversion
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    // Celsius to Fahrenheit conversion
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    // Fahrenheit to Kelvin conversion
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }
    
    // Kelvin to Fahrenheit conversion
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }
    
    // Celsius to Kelvin conversion
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    
    // Kelvin to Celsius conversion
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    
    // Celsius to Réaumur conversion
    public static double celsiusToReaumur(double celsius) {
        return celsius * 0.8;
    }
    
    // Réaumur to Celsius conversion
    public static double reaumurToCelsius(double reaumur) {
        return reaumur / 0.8;
        
    }
}
    