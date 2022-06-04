package laba_3.task_4;
import java.util.Objects;
import java.util.Random;

public class Student {
    private String name;
    private int id;
    public int avg_ex;

    public Student() {
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
