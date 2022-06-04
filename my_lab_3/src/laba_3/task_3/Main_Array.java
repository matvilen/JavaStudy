package laba_3.task_3;
import java.util.ArrayList;
import java.util.Arrays;

public class Main_Array {
    public static void main(String[] args) {

        Array_class ar1 = new Array_class(new ArrayList<Float>(Arrays.asList(1.f, 2.f, 3.f)));
        Array_class ar2 = new Array_class(new ArrayList<Float>(Arrays.asList(4.f, 5.f, 6.f)));

        System.out.println("Array 1 : ");
        System.out.println(ar1);
        System.out.println("Array 2 : ");
        System.out.println(ar2);

        Array_class ar_sum = ar1.getClone();
        Array_class ar_sub = ar1.getClone();
        Array_class ar_mul = ar1.getClone();

        System.out.println();
        System.out.println("Array summation : ");
        ar_sum.summation(ar2);
        System.out.println(ar_sum);

        System.out.println();
        System.out.println("Array subtraction : ");
        ar_sub.subtraction(ar2);
        System.out.println(ar_sub);

        System.out.println();
        System.out.println("Array multiplication : ");
        ar_mul.multiplication(ar2);
        System.out.println(ar_mul);

    }
}
