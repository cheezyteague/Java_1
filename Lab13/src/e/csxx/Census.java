package edu.cscc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Census {
    public static Map<String, Surname> loadCensusData(String fname) {
        int line = 0;
        HashMap<String, Surname> map = new HashMap<>();
        File file = new File(fname);
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String s = input.nextLine();
                String[] tok = s.split(",");
                int rank = Integer.parseInt(tok[1]);
                int count = Integer.parseInt(tok[2]);
                double proportion = Double.parseDouble(tok[3]);
                Surname name = new Surname(tok[0], rank, count, proportion);
                map.put(tok[0], name);
                line++;
            }
            return (map);
        } catch (FileNotFoundException ex) {
            System.out.println("Cannot access file " + fname);
            return (null);
        } catch (NumberFormatException ex) {
            System.out.println("Erroneous data in file on line " + line+1);
            return (null);
        }

    }
}

