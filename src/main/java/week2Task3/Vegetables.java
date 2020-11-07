package week2Task3;

import java.util.Objects;

public class Vegetables {
    private String typeOfVegetable;
    private String colorOfVegetable;
    private double weightOfVegetable;
    private double vegetableCalories;

    public Vegetables(String typeOfVegetable, String colorOfVegetable, double weight, double vegetableCalories) {
        this.typeOfVegetable = typeOfVegetable;
        this.colorOfVegetable = colorOfVegetable;
        this.weightOfVegetable = weight;
        this.vegetableCalories = vegetableCalories;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Vegetables)) {
            return false;
        }
        Vegetables vegetables = (Vegetables) o;
        return Objects.equals(vegetables.getTypeOfVegetable(), vegetables.getTypeOfVegetable())
                && Objects.equals(vegetables.getColorOfVegetable(), vegetables.getColorOfVegetable())
                && Double.compare(vegetables.getWeightOfVegetable(), vegetables.getWeightOfVegetable()) == 0
                && Double.compare(vegetables.getVegetableCalories(), vegetables.getVegetableCalories()) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(getTypeOfVegetable(), getColorOfVegetable(), getWeightOfVegetable(), getVegetableCalories());
    }

    @Override
    public String toString() {
        return getTypeOfVegetable() + getColorOfVegetable() + getWeightOfVegetable() + getVegetableCalories();
    }


    public String getTypeOfVegetable() {
        return typeOfVegetable;
    }

    public String getColorOfVegetable() {
        return colorOfVegetable;
    }

    public double getWeightOfVegetable() {
        return weightOfVegetable;
    }

    public double getVegetableCalories() {
        return vegetableCalories;
    }

    public void add(Object vegetables) {
    }

    public void remove(Object vegetables) {
    }
}

