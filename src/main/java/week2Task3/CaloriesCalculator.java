package week2Task3;

public class CaloriesCalculator {

    public final int onionCalories = 10;
    public final int pepperCalories = 20;
    public final int cucumberCalories = 30;
    public final int potatoCalories = 40;

    public int onionAndPepper() {
        return onionCalories + pepperCalories;
    }

    public int onionAndCucumber() {
        return onionCalories + cucumberCalories;
    }

    public int onionAndPotato() {
        return onionCalories + potatoCalories;

    }

    public int pepperAndCucumber() {
        return pepperCalories + cucumberCalories;
    }

    public int pepperAndPotato() {
        return pepperCalories + potatoCalories;
    }

    public int cucumberAndPotato() {
        return cucumberCalories + potatoCalories;
    }
}