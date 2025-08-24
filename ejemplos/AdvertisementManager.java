package ejemplos; // Comment if necessary

import java.util.ArrayList;

public class AdvertisementManager {
    public static void main(String[] args) {
        ArrayList<String> ads = new ArrayList<>();
        ads.add("Buy One Get One Free");
        ads.add("20% Off All Items");
        ads.add("Free Shipping on Orders Over $50");
        System.out.println("Ads before adding new ad: " + ads);
        // Adding a new ad at the second position
        ads.add(1, "Clearance Sale - Up to 70% Off");
        System.out.println("Ads after adding at index 1: " + ads);
    }
}