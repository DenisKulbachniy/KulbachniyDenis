package week2Task3;

import java.util.ArrayList;

public class Chef {
    ArrayList<Vegetables> salad = new ArrayList<>();

    public void addVegetablesToSalad(String vegetableName, String colorOfVegetable, double weightOfVegetable, double vegetableCalories) {
        Vegetables vegetables = new Vegetables(vegetableName, colorOfVegetable, weightOfVegetable, vegetableCalories);
        salad.add(vegetables);
    }

    public void removeVegetablesFromSaladbyName(String vegetableName) {
        salad.removeIf(a -> a.getVegetableName().equals(vegetableName));
    }

    public void removeVegetablesFromSaladbyColor(String vegetableColor) {
        salad.removeIf(vegetables -> vegetables.getColorOfVegetable().equals(vegetableColor));
    }

    public void saladContains() {
        System.out.println("Salad contains: " + salad);
    }

    public ArrayList<Vegetables> getSalad() {
        return salad;
    }

    public boolean compareVegetables(Vegetables firstVegetable, Vegetables secondVegetable) {
        return (firstVegetable.equals(secondVegetable));

    }

    public int getCalories() {
        return CaloriesCalculator.vegetableCalories(salad);
    }
}


