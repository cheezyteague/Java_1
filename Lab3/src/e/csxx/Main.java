package edu.cscc;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double lbs, inches, meters, kgs, bmi;
        String classification;

        // Weight Input
        System.out.println("Calculate BMI");
        System.out.print("Enter weight (lbs): ");
        lbs = input.nextDouble();

        // Assures LBS is positive
        if (lbs <= 0) {
            // Throw Error and exit
            System.out.println("Sorry that's not a valid weight.\nExiting...");
            System.exit(0);
        } else {
            // Calls the convertToKilograms Method
            kgs = convertToKilograms(lbs);
            // Height Input
            System.out.print("Enter height (inches): ");
            inches = input.nextDouble();

            // Assures height is positive
            if (inches <= 0) {
                // Throw Error and exit
                System.out.println("Sorry that's not a valid height.\nExiting...");
                System.exit(0);
            } else {
                // Calls the convertToMeters, calcBMI, and bmiClassification Methods
                meters = convertToMeters(inches);
                bmi = calcBMI(kgs, meters);
                classification = bmiClassification(bmi);
                // Give user the proper output
                System.out.println("Your BMI is " + bmi);
                System.out.println("Your BMI classification is " + classification);
            }
        }
    }

    // Method converts pounds to kilograms and returns kilograms
    public static double convertToKilograms(double lbs) {
        double kgs = lbs / 2.2046;
        return kgs;
    }

    // Method converts inches to meters and returns meters
    public static double convertToMeters(double inches) {
        double meters = inches / 39.37;
        return meters;
    }

    // Method calculates BMI and returns BMI
    public static double calcBMI(double kgs, double meters) {
        double bmi = kgs/(meters*meters);
        return bmi;
    }

    // Method classifies BMI and returns the classification
    public static String bmiClassification(double bmi) {
        String classification;
        if (bmi < 18.5) {
            classification = "Underweight";
        } else if (bmi < 25.0) {
            classification = "Normal";
        } else if (bmi < 30.0) {
            classification = "Overweight";
        } else {
            classification = "Obese";
        }
        return classification;
    }
}
