package week2Task2;

public class Women extends Human {
    private int amountOfChildren;
    private String nailColor;

    @Override
    void behaviourAndEssence() {
        System.out.println("Behaviour is: " + "Good girl" + "\n" + "Name is: " + getName() + "\n" + "Age is: " + getAge() + "\n" +
                "Height is: " + getHeight() + "\n" + "Weight is: " +  getWeight() + "\n" + "Hair color is: " + getHairColor() + "\n" +
                "Amount of children: " + getAmountOfChildren() + "\n" + "Nail color is: " + getNailColor());
    }

    public Women(String name, int age, double height, int weight, String hairColor, int amountOfChildren, String nailColor) {
        super(name, age, height, weight, hairColor);
        this.amountOfChildren = amountOfChildren;
        this.nailColor = nailColor;
    }

    public int getAmountOfChildren() {
        return amountOfChildren;
    }

    public void setAmountOfChildren(int amountOfChildren) {
        this.amountOfChildren = amountOfChildren;
    }

    public String getNailColor() {
        return nailColor;
    }

    public void setNailColor(String nailColor) {
        this.nailColor = nailColor;
    }
}



