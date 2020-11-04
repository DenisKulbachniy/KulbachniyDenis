package week2Task4;

import java.util.Scanner;

public class Woman extends Human {
    Scanner scanner = new Scanner(System.in);


    public Woman(boolean gender, String name, String secondName, float height, float weight) {
        super(gender, name, secondName, height, weight);
    }

    public Human delivery(Human man, Human woman) {

        if (random.nextInt(100) > 50) {
            String name = scanner.next();
            String secondName = man.getSecondName();
            float height = (float) (man.getHeight() + (woman.getHeight() - man.getHeight()) * 0.1);
            float weight = (float) (man.getHeight() + (woman.getHeight() - man.getHeight()) * 0.1);
            Human human = new Man(true, name, secondName, height, weight);
            System.out.println(human.toString());
            return human;
        } else {
            String name = scanner.next();
            String secondName = woman.getSecondName();
            float height = (float) (woman.getHeight() + (man.getHeight() - woman.getHeight()) * 0.1);
            float weight = (float) (woman.getHeight() + (man.getHeight() - woman.getHeight()) * 0.1);
            Human human = new Woman(false, name, secondName, height, weight);
            System.out.println(human.toString());
            return human;
        }
    }
}

