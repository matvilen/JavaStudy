package laba_3.task_4;
import java.util.Random;

public class Professor {
    private String name;
    private Integer id;
    private Integer plus;

    public Professor(){
    }

    Professor(String name, Integer id){
        this.name = name;
        this.id = id;
    }

    public void addPlus(Integer plus){
        this.plus = plus;
    }

    public Integer assess(){
        Random random = new Random();
        Integer mark = random.nextInt(50)+1+plus;
        return mark;
    }
    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
