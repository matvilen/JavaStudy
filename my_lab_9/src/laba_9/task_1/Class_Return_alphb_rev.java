package laba_9.task_1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//14.	Задана коллекция строк. Отсортировать значения по алфавиту в обратном порядке.
public class Class_Return_alphb_rev {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g"));
        System.out.println(Arrays.toString(list.stream().sorted(Collections.reverseOrder()).toArray()));
    }
}
