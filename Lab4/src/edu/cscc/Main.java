package edu.cscc;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0; //Number of items currently in the grocery list
        String item;
        String[] groceryList = new String[6]; // Item List Declaration

        // Get user input
        while (count < 6) {
            System.out.print("Enter Item: ");
            // Take the next user-written line of input
            item = input.nextLine();
            // Check and Add item
            if (isDuplicate(item, groceryList, count)) {
                // Print error
                System.out.println("Sorry, item: " + item + " is a duplicate.");
            } else {
                // Add to grocery list and update list item count
                groceryList[count] = item;
                count++;
            }
        }

        // Sorts grocery list alphabetically
        Arrays.sort(groceryList);

        // Prints Header
        System.out.println("\nYour Grocery List:");

        // For each item in grocery list, print item
        for (int i = 0; i < count; i++) {
            System.out.println(groceryList[i]);
        }
    }

    // Duplicate checking function
    public static boolean isDuplicate(String item, String[] list, int listcnt) {
        // if user item == item
        if (listcnt > 0) {
            return Arrays.asList(list).contains(item);
        } else {
            return false;
        }
    }
}
