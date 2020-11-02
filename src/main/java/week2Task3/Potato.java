package week2Task3;

public class Potato extends Vegetables {
    private String potato;

    public Potato(String potato, double weight, String colorOfVegetable) {
        super(weight, colorOfVegetable);
        this.potato = potato;
    }

    public String getPotato() {
        return potato;
    }

    public void setPotato(String potato) {
        this.potato = potato;
    }
}
