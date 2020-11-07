package week2Task3;

import java.util.List;

public class CaloriesCalculator {
    public static int vegetableCalories(List<Vegetables> vegetablesList) {
        int v = 0;
        for (Vegetables vegetables1 : vegetablesList) {
            v += vegetables1.getVegetableCalories();
        }
        return v;
    }

}

