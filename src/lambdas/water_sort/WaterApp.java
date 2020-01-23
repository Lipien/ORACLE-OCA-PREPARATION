package lambdas.water_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WaterApp {
    public static void main(String[] args) {
        Water hardWater = new Water("Hard");
        Water softWater = new Water("Soft");
        Water boiledWater = new Water("Boiled");
        Water rawWater = new Water("Raw");
        Water rainWater = new Water("Rain");
        Water snowWater = new Water("Snow");
        Water filteredWater = new Water("Filtered");
        Water reverseOsmosisWater = new Water("Reverse Osmosis");
        Water deionizedWater = new Water("Deionized");
        Water distilledWater = new Water("Distilled");
// List of Water types
        List<Water> waterList = new ArrayList<>();
        waterList.add(hardWater);
        waterList.add(softWater);
        waterList.add(boiledWater);
        waterList.add(rawWater);
        waterList.add(rainWater);
        waterList.add(snowWater);
        waterList.add(filteredWater);
        waterList.add(reverseOsmosisWater);
        waterList.add(deionizedWater);
        waterList.add(distilledWater);
// Without Sort
        System.out.println("Not Sorted: " + waterList);
// With Sort
        // Commenting out Anonymous inner class for λE use
        // Comparator <Water> waterSort = new Comparator <Water> () {
        // @Override
        // public int compare (Water w1, Water w2) {
        // return w1.getSource().compareTo(w2.getSource());
        // }
        // };
        Comparator<Water> waterSort = Comparator.comparing(Water::getSource);
        Collections.sort(waterList, waterSort);
        System.out.println("Sorted: " + waterList);
    }
}
