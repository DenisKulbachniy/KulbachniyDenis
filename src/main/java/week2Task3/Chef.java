package week2Task3;

import java.util.ArrayList;

public class Chef {
    ArrayList<Vegetables> salad = new ArrayList<>();


    public void addVegetablesToSalad(String typeOfVegetable, String colorOfVegetable, double weightOfVegetable, double vegetableCalories) {
        Vegetables vegetables = new Vegetables(typeOfVegetable, colorOfVegetable, weightOfVegetable, vegetableCalories);
        salad.add(vegetables);
    }

    public void removeVegetablesFromSaladbyType(String vegetableType) {
        salad.removeIf(a -> a.getTypeOfVegetable().equals(vegetableType));
        //System.out.println(salad);

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
        return (firstVegetable == secondVegetable);

    }
        public int getCalories (){
        return CaloriesCalculator.vegetableCalories(salad);
        }
}


