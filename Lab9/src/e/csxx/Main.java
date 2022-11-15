package edu.cscc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Takes a CSV file and prints it into a readable format with totals
 * @author Name
 * 
 */
public class Main {
    static final String INPUTFILE = "components.txt";
    static final String PRINTFFORMAT = "%20s %2d    %6.2f\n";
    public static void main(String[] args) {
        // Initialize variables
    	double total = 0, price = 0;
        int quantity= 0;
        Scanner fileread = null;
	File infile = new File(INPUTFILE);
        // Dont display if theres no file being processed.
        if (infile.exists()) {
           System.out.printf("%s%n","           Item Units Price");
        }
	    // TODO - add code that reads the input file, prints a component report, and calculates total cost
        try {
            fileread = new Scanner(infile);
            // Checks if file has another line of data to read
            while (fileread.hasNext()) {
                // Read each line in the input file into a local String variable
                String line = fileread.nextLine();
                // Break up the String into its three components using the split() method
                String csvalues[] = line.split(",");
                try {
                    // Convert Strings to int and double respectively
                    quantity = Integer.parseInt(csvalues[1]);
                    price = Double.parseDouble(csvalues[2]);
                } catch (NumberFormatException e) {
                    System.out.println("Something went wrong with format of the values in the following line: ");
                }
                // Calculate a running total cost using the # of units and the price of each component.
                total += quantity * price;
                // Print a line of output reporting each component, # of units, and price using the printf() method.
                System.out.printf(PRINTFFORMAT, csvalues[0], quantity, price);
                }
            } catch (FileNotFoundException e){
                System.out.print("File not found: " + INPUTFILE);
            } finally {
                if (fileread != null) {
                    fileread.close();
                }
            }
            // Dont display if theres no file being processed.
            if (infile.exists()) {
                // If the file is dirty (NumberFormatException), this format will round the dirty value
                System.out.printf("Total cost: %,.2f", total);
            }
    }
}
