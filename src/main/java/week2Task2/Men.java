package week2Task2;

public class Men extends Human {
    private String beardColor;
    private int bicepsVolume;

    public Men(String name, int age, double height, int weight, String hairColor, String beardColor, int bicepsVolume) {
        super(name, age, height, weight, hairColor);
        this.beardColor = beardColor;
        this.bicepsVolume = bicepsVolume;
    }

    public String getBeardColor() {
        return beardColor;
    }

    public void setBeardColor(String beardColor) {
        this.beardColor = beardColor;
    }

    public int getBicepsVolume() {
        return bicepsVolume;
    }

    public void setBicepsVolume(int bicepsVolume) {
        this.bicepsVolume = bicepsVolume;
    }

    void showMen() {
        System.out.println("Name is: " + getName() + "\n" + "Age is: " + getAge() + "\n" +
                "Height is: " + getHeight() + "\n" + "Weight is: " + getWeight() + "\n" + "Hair color is: " + getHairColor() + "\n" +
                "Beard color is " + getBeardColor() + "\n" + "Biceps volume is: " + getBicepsVolume());
    }
}


