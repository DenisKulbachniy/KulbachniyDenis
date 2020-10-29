package week2Task2;

public class Men {
    private double height;
    private int weight;
    private String hairColor;
    private int age;

    public Men(double height, int weight, String hairColor, int age) {
        this.height = height;
        this.weight = weight;
        this.hairColor = hairColor;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void showMen(){
        System.out.println(" Height is: " + getHeight() + " weight is: " + getWeight() + " hair color is : " + getHairColor() + " age is: " + getAge());
    }
}


