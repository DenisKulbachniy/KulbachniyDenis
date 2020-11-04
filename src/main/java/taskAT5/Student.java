package taskAT5;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class Student {
    private String studentName;
    private String curriculum;
    private LocalDateTime startDate;
LocalDateTime courseDuration = LocalDateTime.of(2020, 11, 10, 8, 00);
    public Student(String studentName, String curriculum, LocalDateTime startDate) {
        this.studentName = studentName;
        this.curriculum = curriculum;
        this.startDate = startDate;
    }

   /* public boolean isCourseFinished(int courseDuration) {
        LocalDateTime currentDate = LocalDateTime.now();
        long diff = ChronoUnit.DAYS.between(startDate, currentDate);

        return diff > courseDuration;
    }
*/


    public String toString() {
        LocalDateTime currentDate = LocalDateTime.now();
        Period p = Period.between(startDate.toLocalDate(), currentDate.toLocalDate());
        //System.out.println("Days " + p.getDays());
        Duration d = Duration.between(startDate.toLocalTime(), currentDate.toLocalTime());
       // System.out.println("Hours " + d.toHours());
        LocalDateTime courseDuration = LocalDateTime.of(2020, 11, 10, 8, 0);
        if (courseDuration. isAfter(currentDate)) {
            System.out.println("Not finished yet");
        }else {
            System.out.println("Student finished program");
        }


        return studentName + "\n" +curriculum + " Start date is: " + LocalDateTime.of(2020, 10, 10, 10, 15) +
                "\n" + " Days from start " + p.getDays()  + "\n" + " Hours " + d.toHours() ;
    }
}

