package week2Task2;

public class Main {
    public static void main(String[] args) {
        Men men = new Men("Denis", 24, 1.81, 85, "Black", "Black", 38);
        Women women = new Women("Kateryna", 27, 1.60, 58, "Blond", 1, "Yellow");
        men.showMen();
        women.showWoman();
    }
}
