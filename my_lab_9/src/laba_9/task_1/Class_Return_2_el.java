package laba_9.task_1;
//13.	Задана коллекция строк. Вернуть два элемента начиная со второго.
import java.util.Arrays;
import java.util.Collection;

public class Class_Return_2_el {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("first", "second", "third", "fourth");
        System.out.println("Collection: ");
        System.out.println(collection);
        Object[] first_two = collection.stream().skip(1).limit(2).toArray();
        System.out.println("First two elements (from second): ");
        System.out.println(Arrays.toString(first_two));
    }
}
