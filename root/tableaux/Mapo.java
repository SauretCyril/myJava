package root.tableaux;

import java.util.HashMap;
//import java.util.HashSet;
import java.util.Map;

public class Mapo {

    public static void main(String[] args) {
        Map<String, Integer> MapIngredients = new HashMap<String, Integer>();
        MapIngredients.put("eggs", 4);
        for (Map.Entry<String, Integer> entry : MapIngredients.entrySet()) {
            printEntry(entry);
        }
    }

    static void printEntry(Map.Entry<String, Integer> entry) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }
}
