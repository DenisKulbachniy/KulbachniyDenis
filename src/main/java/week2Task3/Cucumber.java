package week2Task3;

public class Cucumber extends Vegetables {
    private String cucumber;

    public Cucumber(String cucumber, double weight, String colorOfVegetable) {
        super(weight, colorOfVegetable);
        this.cucumber = cucumber;
    }

    public String getCucumber() {
        return cucumber;
    }

    public void setCucumber(String cucumber) {
        this.cucumber = cucumber;
    }
}
