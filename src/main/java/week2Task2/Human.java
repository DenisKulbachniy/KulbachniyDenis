package week2Task2;

public class Human {
    private String name;
    private int age;
    private double height;
    private int weight;
    private String hairColor;

    void behaviourAndEssence() {

    }

    public Human(String name, int age, double height, int weight, String hairColor) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}