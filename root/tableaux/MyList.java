package root.tableaux;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    public static void main(String[] args) {
        // List<String> myList = new ArrayList<String>();
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(7);
        myList.add(2);
        myList.add(12);

        System.out.println(myList.size()); // -> 2
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

}
