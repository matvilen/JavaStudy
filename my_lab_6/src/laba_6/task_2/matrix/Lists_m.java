package laba_6.task_2.matrix;
import laba_6.task_2.matrix.Elem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
//3.	Во входном файле хранятся две разреженные матрицы А и В.
// Построить циклически связанные списки СА и СВ, содержащие ненулевые элементы
// соответственно матриц А и В. Просматривая списки, вычислить: а) сумму S = A + B; б) произведение P = A * B.
public class Lists_m {

    private  LinkedList<Elem> list_A;
    private LinkedList<Elem> list_B;

    public Lists_m(File mtx_file){
        this.list_A = new LinkedList<>();
        this.list_B = new LinkedList<>();

        Scanner scanner = null;
        try {
            scanner = new Scanner(mtx_file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        boolean got_matrix = false;
        int row_number = 1;
        int col_number = 1;
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] nums = line.split(" ");
            if (nums.length < 2) {
                got_matrix = true;
                row_number = 1;
            } else {
                col_number = 1;
                for (String num : nums) {
                    if(Integer.parseInt(num) != 0) {
                        if (!got_matrix) {
                            list_A.addLast(new Elem(row_number, col_number, Integer.parseInt(num)));
                        } else {
                            list_B.addLast(new Elem(row_number, col_number, Integer.parseInt(num)));
                        }
                    }
                    ++col_number;
                }
                ++row_number;
            }
        }
    }

    public LinkedList<Elem> getList_A(){
        return this.list_A;
    }
    public LinkedList<Elem> getList_B(){
        return this.list_B;
    }
}
