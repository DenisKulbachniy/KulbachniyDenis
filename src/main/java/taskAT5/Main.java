package taskAT5;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Artem Grigorovic", "Java develompent", LocalDateTime.of(2020, 10, 10, 10, 15));
        System.out.println(student1.toString());

    }
}

