package week2Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Man man = new Man(true, "Arnold", "Schwarzenegger", 1.90f, 110.1f);
        //Man man1 = new Man(true, "Artem", "Rectangle", 1.70f, 90.5f);
        Woman woman = new Woman(false, "Natasha", "Sumkina", 1.65f, 65.2f);
        System.out.println(woman.speak(man.isGender(), woman.isGender()));
        System.out.println(woman.tolerate(man.isGender(), woman.isGender()));
        System.out.println(woman.spendTimeTogether(man.getHeight(), woman.getHeight()));
        System.out.println((man.relationship(man,woman)));












        /* Woman woman1 = new Woman(false, "Arina", "Scadovski", 1.71f, 60.6f);
        Scanner sc = new Scanner(System.in);
        System.out.println("What is first gender M or F: ");
        String choice1 = sc.next();
        System.out.println("What is second gender M or F: ");
        String choice2 = sc.next();
        if (choice1.equals("M") && choice2.equals("M")) {
            System.out.println(man.getName() + "\n" + man.getSecondName() + "\n" + man.getHeight() + "\n" + man.getWeight());
            System.out.println(man1.getName() + "\n" + man1.getSecondName() + "\n" + man1.getHeight() + "\n" + man1.getWeight() + "\n" + man.speak(man.isGender(), man1.isGender()));
            System.out.println(man.tolerate(man.isGender(), man1.isGender()));
            System.out.println(man.spendTimeTogether(man.getHeight(), man.getHeight()));
            System.out.println(man.relationship(man, woman));
            if (man.speak(man.isGender(), man1.isGender() == false)) {
                if (man.tolerate(man.isGender(), man1.isGender() == false)) {
                    if (man.spendTimeTogether(man1.getHeight(), man.getHeight()) == false) {
                        //if (man.relationship(human.isGender(), man1.isGender() == false)) {
                        System.out.println("Nothing happened");
                    }
                }
            }
        } else if (choice1.equals("M") && choice2.equals("F")) {
            System.out.println(man.getName() + "\n" + man.getSecondName() + "\n" + man.getHeight() + "\n" + man.getWeight() + "\n");
            System.out.println(woman.getName() + "\n" + woman.getSecondName() + "\n" + woman.getHeight() + "\n" + woman.getWeight());
            System.out.println(man.speak(man.isGender(), woman.isGender()));
            System.out.println(man.tolerate(man.isGender(), woman.isGender()));
            System.out.println(man.spendTimeTogether(man.getHeight(), woman.getHeight()));
            System.out.println(man.relationship(man, woman));
            if (man.speak(man.isGender(), woman.isGender()) == true) {
                if (man.tolerate(man.isGender(), woman.isGender()) == true) {
                    if (man.spendTimeTogether(man.getHeight(), woman.getWeight()) == true) {
                        //if (man.relationship(man, woman) == true) {
                        System.out.println("delivering");
                        System.out.println("Enter name");
                        String choice3 = sc.next();
                        System.out.println(man.getSecondName());
                        System.out.println(0.1 * (man.getHeight() - woman.getHeight()));
                        System.out.println(0.1 * (man.getWeight() - woman.getWeight()));
                    }
                }
            }
        } else if (choice1.equals("F") && choice2.equals("M")) {
            System.out.println(woman.getName() + "\n" + woman.getSecondName() + "\n" + woman.getHeight() + "\n" + woman.getWeight());
            System.out.println(man.getName() + "\n" + man.getSecondName() + "\n" + man.getHeight() + "\n" + man.getWeight() + "\n" + man.speak(man.isGender(), man.isGender()));
            System.out.println(woman.speak(woman.isGender(), man.isGender()));
            System.out.println(woman.tolerate(woman.isGender(), man.isGender()));
            System.out.println(woman.spendTimeTogether(woman.getHeight(), man.getHeight()));
            System.out.println(man.relationship(man, woman));
            if (man.speak(woman.isGender(), man.isGender()) == true) {
                if (woman.tolerate(man.isGender(), man.isGender()) == true) {
                    if (woman.spendTimeTogether(man.getHeight(), man.getWeight()) == true) {
                        System.out.println("delivering");
                        System.out.println("Enter name");
                        String choice3 = sc.next();
                        System.out.println(man.getSecondName());
                        System.out.println(0.1 * (man.getHeight() - woman.getHeight()));
                        System.out.println(0.1 * (man.getWeight() - woman.getWeight()));
                    }
                }
            }
        } else if (choice1.equals("F") && choice2.equals("F")) {
            System.out.println(woman.getName() + "\n" + woman.getSecondName() + "\n" + woman.getHeight() + "\n" + woman.getWeight());
            System.out.println(woman1.getName() + "\n" + woman1.getSecondName() + "\n" + woman1.getHeight() + "\n" + woman1.getWeight() + "\n" + woman.speak(woman.isGender(), woman1.isGender()));
            System.out.println(woman.speak(woman.isGender(), woman1.isGender()));
            System.out.println(woman.tolerate(woman.isGender(), woman1.isGender()));
            System.out.println(woman.spendTimeTogether(woman.getHeight(), woman1.getHeight()));
            System.out.println(woman.relationship(man, woman));
            if (man.speak(man.isGender(), man1.isGender() == false)) {
                if (man.tolerate(man.isGender(), man1.isGender() == false)) {
                    if (man.spendTimeTogether(man1.getHeight(), man.getHeight()) == false) {
                        System.out.println("Nothing happened");
                    }
                }
            }
        }
    }
}
*/


    }
}