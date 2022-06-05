package laba_6.task_2;
import java.util.Objects;

public class MyObject {
    String name;
    int hash;

    public MyObject(String name) {
        this.name = name;
        this.hash = Objects.hash(name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hash);
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + this.name + "'" +
                ", hash='" + this.hash + "'" +
                "}";
    }
}
