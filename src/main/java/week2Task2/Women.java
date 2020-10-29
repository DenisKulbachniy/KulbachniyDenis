package week2Task2;

public class Women {
    private double height;
    private int weight;
    private String hairColor;
    private int age;

    public Women(double height, int weight, String hairColor, int age) {
        this.height = height;
        this.weight = weight;
        this.hairColor = hairColor;
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getHairColor() {
        return hairColor;
    }

    public int getAge() {
        return age;
    }

    public void showWomen() {
        System.out.println(" Height is: " + getHeight() + " weight is: " + getWeight() + " hair color is : " + getHairColor() + " age is: " + getAge());
    }
}
