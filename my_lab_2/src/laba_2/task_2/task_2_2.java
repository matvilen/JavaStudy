package laba_2.task_2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class task_2_2 {
    //Найти сумму элементов матрицы,
    //расположенных между первым и вторым положительными элементами каждой строки.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of matrix (n): ");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(-n, n + 1);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[] matrix_strings = new int[n];
        for(int i = 0; i < n; i++) {
            matrix_strings[i] = 0;
            boolean positive_numb_1 = false;
            boolean positive_numb_2 = false;
            int positiv_1=0;
            int positiv_2=0;
            for (int j = 0; j < n-1; j++) {
                if (matrix[i][j] > 0) {
                    if (!positive_numb_1) {
                        positiv_1 = j;
                        positive_numb_1 = true;
                    } else if(!positive_numb_2) {
                        positiv_2 = j;
                        positive_numb_2 = true;
                    }
                }
            }
            int rasn = positiv_2 - positiv_1;
            if ((positive_numb_2) &&(rasn>1)) {
                for (int j = positiv_1 + 1; j < positiv_2; j++) {
                    matrix_strings[i] += matrix[i][j];
                }
            }
        }
        int sum=0;
        for (int i=0; i<n; i++){
            sum+=matrix_strings[i];
        }
        System.out.print("\n Sum of elements is: " + sum);
    }
}
