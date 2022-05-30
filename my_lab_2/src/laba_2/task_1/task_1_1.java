package laba_2.task_1;
import java.util.Scanner;

public class task_1_1 {
    //Ввести n строк с консоли. Вывести на консоль те строки,
    //длина которых меньше (больше) средней, а также длину.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of strings (n): ");
        int n = in.nextInt();
        in.skip("\n");

        System.out.print("Enter strings: \n");
        String[] array_string = new String[n];
        for (int i = 0; i < n; i++) {
            array_string[i] = in.nextLine();
        }

        int avrg_length = 0;
        for (int i = 0; i < n; i++) {
            avrg_length += array_string[i].length();
        }
        avrg_length = avrg_length/n;
        System.out.println("Average string length: " + avrg_length);

        System.out.print("\nStrings with minimum length: \n");
        for (int i = 0; i < n; i++) {
            if(array_string[i].length() < avrg_length){
                System.out.println(array_string[i]);
            }
        }
        System.out.print("\nStrings with bigger length: \n");
        for (int i = 0; i < n; i++) {
            if(array_string[i].length() > avrg_length){
                System.out.println(array_string[i]);
            }
        }

    }
}
