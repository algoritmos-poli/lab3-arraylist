package ejemplos; // Comment if necessary

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDeclaration {
    public static void main(String[] args) {
        ArrayList<String> asList = new ArrayList<>(Arrays.asList("Dell", "Lenovo", "HP"));
        System.out.println("ArrayList from Arrays.asList: " + asList);
        asList.add("Apple");
        System.out.println("Updated ArrayList: " + asList);
    }
}