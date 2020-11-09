package week2Task3;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef();

        chef.addVegetablesToSalad(" Potato ", " Red ", 0.3, 30);
        chef.addVegetablesToSalad(" Onion ", " Green ", 0.05, 20);
        chef.addVegetablesToSalad(" Cucumber ", " Green ", 0.2, 30);
        chef.addVegetablesToSalad(" Carrot ", " Orange ", 0.3, 40);
        chef.saladContains();
        chef.removeVegetablesFromSaladbyType(" Cucumber ");
        chef.removeVegetablesFromSaladbyColor(" Green ");
        chef.saladContains();
        chef.compareVegetables(chef.getSalad().get(0), chef.getSalad().get(1));
        System.out.println("Comparing of vegetables: " + chef.compareVegetables(chef.getSalad().get(0), chef.getSalad().get(1)));
        System.out.println("Calories: " + chef.getCalories());
    }
}
