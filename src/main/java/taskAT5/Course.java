package taskAT5;

import java.time.LocalDateTime;

public class Course {
    private String courseName;
    private LocalDateTime courseDuration;


    public Course(String courseName, LocalDateTime courseDuration) {
        this.courseName = courseName;
        this.courseDuration = courseDuration;

    }
   // public String toString(){
        //return
  //  }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDateTime getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(LocalDateTime courseDuration) {
        this.courseDuration = courseDuration;
    }
}
