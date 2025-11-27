package part_41.task_4;

import java.util.Scanner;

public class Matrix {
    int stroka;
    int stolb;
    float[][] matrix;

    Scanner sc0 = new Scanner(System.in);

    public Matrix(int stroka, int stolb) {
        this.stroka = stroka;
        this.stolb = stolb;
        this.matrix = new float[stroka][stolb];
    }

    public int getStroka() {
        return stroka;
    }

    public void setStroka(int stroka) {
        this.stroka = stroka;
    }

    public int getStolb() {
        return stolb;
    }

    public void setStolb(int stolb) {
        this.stolb = stolb;
    }

    public static float[][] summa(float[][] a, float[][] b) {
        int row = a.length;
        int column = a[0].length;
        float[][] result = new float[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    public static float[][] mult(float[][] a, float number) {
        int row = a.length;
        int column = a[0].length;
        float[][] result = new float[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = a[i][j] * number;
            }
        }
        return result;
    }

    public static void printing(float [][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}




