package week2Task3;

public class Pepper extends Vegetables {
    private String pepper;

    public Pepper(String pepper, double weight, String colorOfVegetable) {
        super(weight, colorOfVegetable);
        this.pepper = pepper;
    }

    public String getPepper() {
        return pepper;
    }

    public void setPepper(String pepper) {
        this.pepper = pepper;
    }
}
