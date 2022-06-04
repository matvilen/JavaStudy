package laba_3.task_1;
//4.	Определить класс Матрица размерности (n x n). Класс должен содержать несколько конструкторов.
// Реализовать методы для сложения, вычитания, умножения матриц. Объявить массив объектов.
// Создать методы, вычисляющие первую и вторую нормы матрицы
public class Matrix {
    public static void main(String[] args) {
        int[][] n = {{1, 2}, {3, 4}};
        int[][] m = {{5, 6}, {7, 8}};


        SquareMatrix mtxA = new SquareMatrix(n);
        SquareMatrix mtxB = new SquareMatrix(m);
        SquareMatrix mtxC = new SquareMatrix(2);

        SquareMatrix[] mtxmas = new SquareMatrix[2];
        mtxmas[0] = mtxA;
        mtxmas[1] = mtxB;

        SquareMatrix addMtx = mtxmas[0].add(mtxmas[1]);
        SquareMatrix subMtx = mtxmas[0].sub(mtxmas[1]);
        SquareMatrix mulMtx = mtxmas[0].mul(mtxmas[1]);

        System.out.println("add:\n" + mtxmas[0].add(mtxmas[1]).toString() +
                "sub:\n" + mtxmas[0].sub(mtxmas[1]).toString() +
                "mul:\n" + mtxmas[0].mul(mtxmas[1]).toString());

        int minIdx = -1;
        if ((mtxmas[0].firstNorma() < mtxmas[1].firstNorma()) && (mtxmas[0].secondNorma() < mtxmas[1].secondNorma())) {
            minIdx = 0;
        } else if ((mtxmas[1].firstNorma() < mtxmas[0].firstNorma()) && (mtxmas[1].secondNorma() < mtxmas[0].secondNorma())) {
            minIdx = 1;
        }

        System.out.println("Matrix with min first and second normas: " + (minIdx == -1 ? "None" : minIdx));
    }

}
