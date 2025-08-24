package ejemplos;

import java.util.ArrayList;

public class CapacityArrayList {
    public static void main(String[] args) {
        ArrayList<String> capacityList = new ArrayList<>(50); // Initialize with an initial capacity of 50
        capacityList.add("Capacity");
        System.out.println("ArrayList with Initial Capacity: " + capacityList.size());
    }
}