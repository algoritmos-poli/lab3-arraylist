package ejemplos;   // Comment if necessary

import java.util.ArrayList;

public class BasicArrayList {
    public static void main(String[] args) {
        ArrayList lst = new ArrayList(); // Declaring an ArrayList without specifying a type
        lst.add("ArrayList declaration");  // Adding a String
        lst.add(123); // Adding an Integer
        System.out.println("Basic ArrayList: " + lst);
    }
}
