package laba_5.task_1;

public class SquareMatrix {
    private int nDim;
    private int[][] matrix;
    public SquareMatrix() {
        nDim = 1;
        matrix = new int[1][1];
        matrix[0][0] = 0;
    }
    public SquareMatrix(int n) {
        nDim = n;
        matrix = new int[nDim][nDim];
        for (int i = 0; i < nDim; i++) {
            for (int j = 0; j < nDim; j++) {
                matrix[i][j] = 0;
            }
        }
    }
    public SquareMatrix(int[][] mtx) {
        set(mtx);
    }
    public void set(int[][] mtx) {
        nDim = mtx.length;
        matrix = new int[nDim][nDim];
        for (int i = 0; i < nDim; i++) {
            for (int j = 0; j < nDim; j++) {
                matrix[i][j] = mtx[i][j];
            }
        }
    }
    public int[][] get() {
        return matrix;
    }

    public SquareMatrix add( SquareMatrix rMtx) {
        try {
            int[][] resMtx = new int[nDim][nDim];
            int[][] rightMtx = rMtx.get();

            for (int i = 0; i < nDim; i++) {
                for (int j = 0; j < nDim; j++) {
                    resMtx[i][j] = matrix[i][j] + rightMtx[i][j];
                }
            }
            return new SquareMatrix(resMtx);
        } catch (Exception error){
            System.out.println("Error in add method");
            return rMtx;
        }
    }

    public SquareMatrix sub(SquareMatrix rMtx) {
        try {
            int[][] resMtx = new int[nDim][nDim];
            int[][] rightMtx = rMtx.get();

            for (int i = 0; i < nDim; i++) {
                for (int j = 0; j < nDim; j++) {
                    resMtx[i][j] = matrix[i][j] - rightMtx[i][j];
                }
            }
            return new SquareMatrix(resMtx);
        } catch (Exception error){
            System.out.println("Error in sub method");
            return rMtx;
        }
        }


    public SquareMatrix mul(SquareMatrix rMtx) {
        try {
            int[][] resMtx = new int[nDim][nDim];
            int[][] rightMtx = rMtx.get();

            for (int i = 0; i < nDim; i++) {
                for (int j = 0; j < nDim; j++) {
                    resMtx[i][j] = 0;
                    for (int k = 0; k < nDim; k++) {
                        resMtx[i][j] += matrix[i][k] * rightMtx[k][j];
                    }
                }
            }
            return new SquareMatrix(resMtx);
        }catch (Exception error) {
            System.out.println("Error in mul method");
            return rMtx;
        }

    }

    public int firstNorma() {
        try {
            int max = 0;
            for (int i = 0; i < nDim; i++) {
                max += matrix[0][i];
            }
            for (int i = 1; i < nDim; i++) {
                int sum = 0;
                for (int j = 0; j < nDim; j++) {
                    sum += matrix[i][j];
                }
                max = Math.max(max, sum);
            }
            return max;
        } catch (Exception error){
            System.out.println("Error in firstNorma method");
            return 0;
        }
    }

    public int secondNorma() {
        try {
            int max = 0;
            for (int i = 0; i < nDim; i++) {
                max += matrix[i][0];
            }
            for (int i = 0; i < nDim; i++) {
                int sum = 0;
                for (int j = 1; j < nDim; j++) {
                    sum += matrix[j][i];
                }
                max = Math.max(max, sum);
            }
            return max;
        }catch (Exception error){
            System.out.println("Error in secondNorma method");
            return 0;
        }
    }

    @Override
    public String toString() {
        StringBuilder mtxString = new StringBuilder("");
        for (int i = 0; i < nDim; i++) {
            for (int j = 0; j < nDim-1; j++) {
                mtxString.append(matrix[i][j]);
                mtxString.append("\t");
            }
            mtxString.append(matrix[i][nDim-1]);
            mtxString.append("\n");
        }
        return mtxString.toString();
    }
}

