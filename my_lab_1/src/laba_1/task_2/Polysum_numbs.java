package laba_1.task_2;

import java.util.Scanner;

public class Polysum_numbs {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array (n): ");
        int n = in.nextInt();

        System.out.print("Enter numbers: \n");
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = in.nextInt();
        }

        boolean polysum = false; //
        System.out.print("\nPolysum numbers: \n");

        boolean polysum_number;
        for (int i = 1; i < n-1; i++) {
            polysum_number = true;
            if (myArray[i] != (myArray[i-1] + myArray[i+1])/2){
                polysum_number = false;
                break;
            }
            if (polysum_number){
                polysum = true;
                System.out.print(myArray[i] + " ");
            }
        }
        if (!polysum) {
            System.out.print("No palysum numbers");
        }

        in.close();

    }
}
