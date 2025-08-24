package ejemplos; // Comment if necessary

import java.util.ArrayList;

public class GenericArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>(); // ArrayList for storing Strings only
        stringList.add("Generic List");
        // stringList.add(123); // This line would cause a compile-time error
        System.out.println("Generic ArrayList: " + stringList);
    }
}