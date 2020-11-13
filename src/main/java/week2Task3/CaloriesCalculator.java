package week2Task3;

import java.util.List;

public class CaloriesCalculator {
    public static int vegetableCalories(List<Vegetables> vegetablesList) {
        int vegetableCalories = 0;
        for (Vegetables vegetables1 : vegetablesList) {
            vegetableCalories += vegetables1.getVegetableCalories();
        }
        return vegetableCalories;
    }

}

