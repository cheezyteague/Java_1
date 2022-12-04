package e.csxx;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.HashSet;


/**
 * Utility to process a document to into sorted set of unique words
 * @author 
 */
public class UniqueWords {
    public static Set<String> processDocument(File myfile) throws IOException {
        Scanner file = new Scanner(myfile);
        HashSet<String> h = new HashSet<>();
        while (file.hasNextLine()) {
            String line = file.nextLine();
            String[] tokenizedLine = tokenize(line);
            h.addAll(Arrays.asList(tokenizedLine));
        }
        h = sortHash(h);
        return h;
    }

    public static String[] tokenize(String str) {
        str = str.replaceAll("[^a-zA-Z \n]"," ");
        String[] tok = str.split(" ");
        for (int i=0; i<tok.length;++i) {
            tok[i] = tok[i].toLowerCase();
        }
        return tok;
    }

    public static LinkedHashSet<String> sortHash(HashSet<String> h) {
        List<String> List1 = new ArrayList<String>(h);
        Collections.sort(List1);
        LinkedHashSet<String> sortedh = new LinkedHashSet<>(List1);
        return sortedh;
    }
}
