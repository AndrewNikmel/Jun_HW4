package org.example;

import javax.persistence.*;
import java.util.Random;

@Entity
@Table(name = "Courses")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private double duration;

    private static final Random random = new Random();
    private static final String[] titles = new String[]{"Computer Science", "Mathematics and Statistics",
            "Environmental ", "Science", "Mechanical Engineering", "Business Administration", "Psychology",
            "Electrical Engineering",
            "History of Art"};

    public Courses(int id, String title, double duration) {
        this.id = id;
        this.title = title;
        this.duration = duration;
    }

    public Courses(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public Courses() {
    }

    public static Courses create() { return new Courses (titles[random.nextInt(titles.length)], random.nextDouble(45,
            90));}

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void updateTitle() { title = titles[random.nextInt(titles.length)]; }
    public void updateDuration() {duration = random.nextDouble(45, 90); }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}