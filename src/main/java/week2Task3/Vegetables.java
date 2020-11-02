package week2Task3;

public class Vegetables {
    private double weight;
    private String colorOfVegetable;


    public Vegetables(double weight, String colorOfVegetable) {
        this.weight = weight;
        this.colorOfVegetable = colorOfVegetable;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColorOfVegetable() {
        return colorOfVegetable;
    }

    public void setColorOfVegetable(String colorOfVegetable) {
        this.colorOfVegetable = colorOfVegetable;
    }
}
