package week2Task3;

public class Onion extends Vegetables {
    private String onion;

    public Onion(String onion, double weight, String colorOfVegetable) {
        super(weight, colorOfVegetable);
        this.onion = onion;
    }

    public String getOnion() {
        return onion;
    }

    public void setOnion(String onion) {
        this.onion = onion;
    }
}
