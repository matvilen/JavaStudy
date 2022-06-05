package laba_9.task_2;
import java.util.ArrayList;
import java.util.Arrays;

public class Class_task_14 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g"));
        System.out.println(Arrays.toString(list.stream().map( x -> "_task14" + x ).toArray()));
    }
}
