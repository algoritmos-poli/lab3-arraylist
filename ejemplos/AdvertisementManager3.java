package ejemplos;

import java.util.ArrayList;

public class AdvertisementManager3 {
    public static void main(String[] args) {
        ArrayList<String> ads = new ArrayList<>();
        ads.add("Buy One Get One Free");
        ads.add("20% Off All Items");
        
        System.out.println("Before updating the ad: " + ads);
        
        // Updating an ad
        ads.set(1, "30% Off All Items");
        
        System.out.println("After updating the ad: " + ads);
    }
}
