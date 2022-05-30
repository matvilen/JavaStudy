package laba_2.task_2;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class task_2_1 {
    //Найти и вывести наибольшее число возрастающих (убывающих)
    //элементов матрицы, идущих подряд.
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

        int number_of_vosrast_el_row = 0;
        int index_of_vosrast_el_row = 0;
        int number_of_ybuvaush_el_row = 0;
        int index_of_ybuvaush_el_row = 0;
        for(int i = 0; i < n; i++) {
            int vosrastCount = 1;
            int ybuvaushCount = 1;
            for (int j = 0; j < n-1; j++) {
                if (matrix[i][j] < matrix[i][j+1]){
                    vosrastCount++;
                }
                else {
                    vosrastCount = 1;
                }
                if (vosrastCount > number_of_vosrast_el_row){
                    number_of_vosrast_el_row = vosrastCount;
                    index_of_vosrast_el_row = i;
                }
                if (matrix[i][j] > matrix[i][j+1]){
                    ybuvaushCount++;
                }
                else {
                    ybuvaushCount = 1;
                }
                if (ybuvaushCount > number_of_ybuvaush_el_row){
                    number_of_ybuvaush_el_row = ybuvaushCount;
                    index_of_ybuvaush_el_row = i;
                }
            }
        }
        if (number_of_vosrast_el_row > number_of_ybuvaush_el_row){
            System.out.print("number of maximum vosrast(ybuvaushih) elements in row: " + number_of_vosrast_el_row);
        }
        else System.out.print("number of maximum vosrast(ybuvaushih) elements in row: " + number_of_ybuvaush_el_row);

        int number_of_vosrast_el_col = 0;
        int index_of_vosrast_el_col = 0;
        int number_of_ybuvaush_el_col = 0;
        int index_of_ybuvaush_el_col = 0;
        for(int j = 0; j < n; j++) {
            int ascCount = 1;
            int descCount = 1;
            for (int i = 0; i < n-1; i++) {
                if (matrix[i][j] < matrix[i+1][j]){
                    ascCount++;
                }
                else {
                    ascCount = 1;
                }
                if (ascCount > number_of_vosrast_el_col){
                    number_of_vosrast_el_col = ascCount;
                    index_of_vosrast_el_col = i;
                }
                if (matrix[i][j] > matrix[i+1][j]){
                    descCount++;
                }
                else {
                    descCount = 1;
                }
                if (descCount > number_of_ybuvaush_el_col){
                    number_of_ybuvaush_el_col = descCount;
                    index_of_ybuvaush_el_col = i;
                }
            }
        }
        if (number_of_vosrast_el_col > number_of_ybuvaush_el_col){
            System.out.print("\n number of maximum vosrast(ybuvaushih) elements in col: " + number_of_vosrast_el_col);
        }
        else System.out.print("\n number of maximum vosrast(ybuvaushih) elements in col: " + number_of_ybuvaush_el_col);
    }
}

