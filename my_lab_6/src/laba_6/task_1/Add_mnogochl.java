package laba_6.task_1;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
//Сложить два многочлена заданной степени, если коэффициенты многочленов хранятся в объекте HashMap.
public class Add_mnogochl {
    public static void main(String[] args) {

        HashMap<Integer, Integer> mnogochl_1 = new HashMap<>();
        HashMap<Integer, Integer> mnogochl_2 = new HashMap<>();

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Stepen mnogochlena = ");
        int stepen = scanner.nextInt();

        for (int i = 0; i < stepen; ++i) {
            mnogochl_1.put(i, random.nextInt(50));
            mnogochl_2.put(i, random.nextInt(50));
        }
        System.out.println(mnogochl_1.values());
        System.out.println(mnogochl_2.values());


        HashMap<Integer, Integer> mnogochl_3 = new HashMap<>();
        for (int key : mnogochl_1.keySet()) {
            mnogochl_3.put(key, mnogochl_1.get(key) + mnogochl_2.get(key));
        }
        System.out.println("New mnogochlen: ");
        System.out.println(mnogochl_3.values());

    }
}
