package laba_1.task_2;
import java.util.Scanner;

public class Palindroms {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array (n): ");
        int n = in.nextInt();

        System.out.print("Enter numbers: \n");
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = in.nextInt();
        }

        boolean palindrom = false; //
        System.out.print("\nPalindroms: \n");

        boolean palindrom_number;
        for (int i = 0; i < n; i++) {
            String numAsString = myArray[i] + "";
            palindrom_number = true;
            for (int j = 0; j < numAsString.length()/2; j++) {
                if (numAsString.charAt(j) !=  numAsString.charAt(numAsString.length() - j - 1)){
                    palindrom_number = false;
                    break;
                }
            }
            if (palindrom_number){
                palindrom = true;
                System.out.print(myArray[i] + " ");
            }
        }
        if (!palindrom) {
            System.out.print("No palindrom numbers");
        }

        in.close();

    }
}
