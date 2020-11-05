package week2Task4;

public class Main {
    public static void main(String[] args) {
        Man man = new Man(true, "Arnold", "Schwarzenegger", 1.90f, 110.1f);
        Woman woman = new Woman(false, "Natasha", "Sumkina", 1.65f, 65.2f);
        System.out.println("speak " + woman.speak(man.isGender(), woman.isGender()));
        System.out.println("tolerate " + woman.tolerate(man.isGender(), woman.isGender()));
        System.out.println("spend time together " + woman.spendTimeTogether(man.getHeight(), woman.getHeight()));
        System.out.println("Delivery:)))" + "\n" + (man.relationship(man, woman)));
    }
}







