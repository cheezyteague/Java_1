package edu.cscc;


import java.util.Map;
import java.util.Scanner;

/**
 * @author 
 */
public class Main {
    private final static String CENSUSDATAFNAME = "Surnames_2010Census.csv";
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Map<String, Surname> map = Census.loadCensusData(CENSUSDATAFNAME);

        while (!map.isEmpty()) {
            System.out.print("Enter a surname (or quit to end): ");
            String surname = input.nextLine();
            if (surname.equalsIgnoreCase("quit")) {
                System.out.println("quitting!");
                System.exit(0);
            } else if (map.containsKey(surname.toUpperCase())) {
                Surname objSurname = map.get(surname.toUpperCase());
                System.out.println(String.format("Surname: %s Rank: %s Count: %s Proportion: %s",
                        objSurname.getName(),
                        objSurname.getRank(),
                        objSurname.getCount(),
                        objSurname.getProportion()));
            } else {
                System.out.println(String.format("Surname: %s not found", surname));
            }
        }
    }
}

