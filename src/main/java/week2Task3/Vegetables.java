package week2Task3;

import java.util.Objects;

public class Vegetables {
    private String vegetableName;
    private String colorOfVegetable;
    private double weightOfVegetable;
    private double vegetableCalories;

    public Vegetables(String vegetableName, String colorOfVegetable, double weight, double vegetableCalories) {
        this.vegetableName = vegetableName;
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
        return Objects.equals(vegetables.getVegetableName(), vegetables.getVegetableName())
                && Objects.equals(vegetables.getColorOfVegetable(), vegetables.getColorOfVegetable())
                && Double.compare(vegetables.getWeightOfVegetable(), vegetables.getWeightOfVegetable()) == 0
                && Double.compare(vegetables.getVegetableCalories(), vegetables.getVegetableCalories()) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(getVegetableName(), getColorOfVegetable(), getWeightOfVegetable(), getVegetableCalories());
    }

    @Override
    public String toString() {
        return getVegetableName() + getColorOfVegetable() + getWeightOfVegetable() + getVegetableCalories();
    }


    public String getVegetableName() {
        return vegetableName;
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

}

