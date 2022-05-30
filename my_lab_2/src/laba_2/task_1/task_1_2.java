package laba_2.task_1;

import java.util.Scanner;
import java.util.HashSet;

public class task_1_2 {
    //Ввести n слов с консоли. Найти слово,
    // в котором число различных символов минимально.
    //Если таких слов несколько, найти первое из них.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of words (n): ");
        int n = in.nextInt();
        in.skip("\n");

        System.out.print("Enter strings: \n");
        String[] array_string = new String[n];
        for (int i = 0; i < n; i++) {
            array_string[i] = in.nextLine();
        }

        int min_length = 1000;
        String return_word = "no words";
        for (int i = 0; i < n; i++) {
            HashSet<Character> symbols = new HashSet<>();
            for (char ch: array_string[i].toCharArray()) {
                symbols.add(ch);
            }
            if (symbols.size()<min_length){
                min_length = symbols.size();
                return_word = array_string[i];
            }
        }
        System.out.println("Word with minimal number of diff symbols:" + return_word);
        System.out.println("Number of diff symbols: " + min_length);

    }
}
