package laba_6.task_2.matrix;

import java.io.File;
import java.util.LinkedList;

public class MatrixMain {
    public static void main(String[] args) {

        File matrix_file = new File("C:\\Users\\metel\\IdeaProjects\\my_lab_6\\src\\laba_6\\task_2\\matrix_file.txt");

        Lists_m my_mtx = new Lists_m(matrix_file);

        System.out.println(my_mtx.getList_A());
        System.out.println(my_mtx.getList_B());

        //Sum
        LinkedList<Elem> sum_matrix = new LinkedList<>();
        int ind_a = 0;
        int ind_b = 0;
        boolean sum_flag = true;

        while(sum_flag) {
            if((my_mtx.getList_A().get(ind_a).getRow() == my_mtx.getList_B().get(ind_b).getRow()) &&
                    (my_mtx.getList_A().get(ind_a).getCol() == my_mtx.getList_B().get(ind_b).getCol())) {
                sum_matrix.addLast(new Elem(my_mtx.getList_A().get(ind_a).getRow(), my_mtx.getList_A().get(ind_a).getCol(), my_mtx.getList_A().get(ind_a).getMeaning() + my_mtx.getList_B().get(ind_b).getMeaning()));
                ind_a++;
                ind_b++;
            } else {
                if (my_mtx.getList_A().get(ind_a).getRow() == my_mtx.getList_B().get(ind_b).getRow()) {
                    if (my_mtx.getList_A().get(ind_a).getCol() > my_mtx.getList_B().get(ind_b).getCol()) {
                        sum_matrix.addLast(new Elem(my_mtx.getList_B().get(ind_b).getRow(), my_mtx.getList_B().get(ind_b).getCol(), my_mtx.getList_B().get(ind_b).getMeaning()));
                        ind_b++;
                    } else {
                        sum_matrix.addLast(new Elem(my_mtx.getList_A().get(ind_a).getRow(), my_mtx.getList_A().get(ind_a).getCol(), my_mtx.getList_A().get(ind_a).getMeaning()));
                        ind_a++;
                    }
                } else {
                    if (my_mtx.getList_A().get(ind_a).getRow() > my_mtx.getList_B().get(ind_b).getRow()){
                        sum_matrix.addLast(new Elem(my_mtx.getList_B().get(ind_b).getRow(), my_mtx.getList_B().get(ind_b).getCol(), my_mtx.getList_B().get(ind_b).getMeaning()));
                        ind_b++;
                    } else {
                        sum_matrix.addLast(new Elem(my_mtx.getList_A().get(ind_a).getRow(), my_mtx.getList_A().get(ind_a).getCol(), my_mtx.getList_A().get(ind_a).getMeaning()));
                        ind_a++;
                    }
                }
            }
            if(ind_a == my_mtx.getList_A().size()) {
                sum_flag = false;
                for (int i = ind_b; i < my_mtx.getList_B().size(); i++) {
                    sum_matrix.addLast(new Elem(my_mtx.getList_B().get(i).getRow(), my_mtx.getList_B().get(i).getCol(), my_mtx.getList_B().get(i).getMeaning()));
                }
            } else if(ind_b == my_mtx.getList_B().size()){
                sum_flag = false;
                for (int i = ind_a; i < my_mtx.getList_A().size(); i++) {
                    sum_matrix.addLast(new Elem(my_mtx.getList_A().get(i).getRow(), my_mtx.getList_A().get(i).getCol(), my_mtx.getList_A().get(i).getMeaning()));
                }
            }
        }

        //Mul
        LinkedList<Elem> mul_matrix = new LinkedList<>();
        int answer = 0;

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                answer = 0;
                for (int k = 1; k < 4; k++) {

                    for (int l = 0; l < my_mtx.getList_A().size(); l++) {
                        if((my_mtx.getList_A().get(l).getRow() == i) && (my_mtx.getList_A().get(l).getCol() == k)){

                            for (int m = 0; m < my_mtx.getList_B().size(); m++) {
                                if(my_mtx.getList_B().get(m).getRow() == k && my_mtx.getList_B().get(m).getCol() == j){
                                    answer += my_mtx.getList_A().get(l).getMeaning() * my_mtx.getList_B().get(m).getMeaning();
                                    break;
                                }
                            }
                            break;
                        }
                    }
                }
                if(answer != 0) {
                    mul_matrix.addLast(new Elem(i, j, answer));
                }
            }
        }
        System.out.println("SUM: " + sum_matrix);
        System.out.println("MUL: "+ mul_matrix);
    }
}
