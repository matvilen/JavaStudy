package laba_3.task_1;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MyVector {

    public static void main(String[] args) {

        MyVectorClass vec1 = new MyVectorClass(0, 1, 0, 0, 0, 0);
        MyVectorClass vec2 = new MyVectorClass(0, 0, 0, 1, 0, 1);
        MyVectorClass vec3 = new MyVectorClass(0, 1, 0, 1, 0, 1);
        MyVectorClass vec4 = new MyVectorClass(0, 1, 0, -1, 0, 1);
        MyVectorClass vec5 = new MyVectorClass(0, 0, 0, 1, 0, 0);
        MyVectorClass vec6 = new MyVectorClass(0, 0, 0, 2, 0, 0);
        MyVectorClass vec7 = new MyVectorClass(0, 0, 0, 7, 0, 0);

        System.out.println("1 vector: "+vec1);
        System.out.println("2 vector: "+vec2);
        System.out.println("3 vector: "+vec3);
        System.out.println("4 vector: "+vec4);
        System.out.println("5 vector: "+vec5);
        System.out.println("6 vector: "+vec6);
        System.out.println("7 vector: "+vec7);

        System.out.println("Vectors 1 and 2:");
        System.out.println( vec1.ortogonalnost(vec2) ? "Vectors are orthogonal" : "Vectors aren't orthogonal");
        System.out.println(vec1.compareVectors(vec2));



        System.out.println("Vectors 3 and 4:");
        System.out.println( vec3.ortogonalnost(vec4) ? "Vectors are orthogonal" : "Vectors aren't orthogonal");
        System.out.println( vec3.peresechenie(vec4, 0.5f) ? "Vectors are crossed" : "Vectors aren't crossed");
        System.out.println(vec3.compareVectors(vec4));


        System.out.println("Vectors 2 and 3:");
        System.out.println(vec1.complenarnost(vec2, vec3) ? "Vectors are complanar" : "Vectors aren't complanar");
        System.out.println("Vectors 6 and 7:");
        System.out.println(vec5.complenarnost(vec6, vec7) ? "Vectors are complanar" : "Vectors aren't complanar");


        //создадим рандомный массив для определения копл-ти векторов
        ArrayList<MyVectorClass> vectorArrayList = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of vectors: ");
        int s = in.nextInt();
        Random random = new Random();
        float x_1, x_2, y_1, y_2, z_1, z_2;
        float bound_1 = -3.f;
        float bound_2 = 3.f;
        for (int i = 0; i < s; i++) {
            x_1 = random.nextFloat(bound_1, bound_2);
            x_2 = random.nextFloat(bound_1, bound_2);
            y_1 = random.nextFloat(bound_1, bound_2);
            y_2 = random.nextFloat(bound_1, bound_2);
            z_1 = random.nextFloat(bound_1, bound_2);
            z_2 = random.nextFloat(bound_1, bound_2);
            vectorArrayList.add(new MyVectorClass(x_1, x_2, y_1, y_2, z_1, z_2));
        }
        for (int i = 0; i < s-2; i++) {
            for (int j = i+1; j < s-1; j++) {
                for (int k = j+1; k < s; k++) {
                    System.out.println(vectorArrayList.get(i).complenarnost(vectorArrayList.get(j), vectorArrayList.get(k)) ? "Vectors are complanar" : "Vectors aren't complanar");
                }
            }
        }
    }
}
