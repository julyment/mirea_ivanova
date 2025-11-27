package part_41.task_4;

import java.util.Scanner;

import static part_41.task_4.Matrix.*;

public class TestMatrix {
    public static void main(String[] args) {
        System.out.println("Введите размерность 1-ой матрицы ");
        Scanner sc = new Scanner(System.in);
        int row1 = sc.nextInt();
        int column1 = sc.nextInt();
        float[][] matrix1 = new float[row1][column1];

        System.out.println("Вводим элементы 1-ой матрицы");
        for (int i = 0; i < matrix1.length; i++){
            System.out.println("Введите элементы " + (i+1) + " строки"); //тут может ошибится
            for (int j = 0; j < matrix1[0].length; j++){
                matrix1[i][j] = sc.nextFloat();
            }
        }

        System.out.println("Введите размерность 2-ой матрицы ");
        int row2 = sc.nextInt();
        int column2 = sc.nextInt();
        float[][] matrix2 = new float[row2][column2];

        System.out.println("Вводим элементы 2-ой матрицы");
        for (int i = 0; i < matrix2.length; i++){
            System.out.println("Введите элементы " + (i+1) + " строки"); //тут может ошибится
            for (int j = 0; j < matrix2[0].length; j++){
                matrix2[i][j] = sc.nextFloat();
            }
        }



        if (row1 == row2 && column1 == column2){
            float [][] result = summa(matrix1, matrix2);
            System.out.println("Результат сложения двух матриц: ");
            printing(result);

        }
        else{
            System.out.println("Размер матриц должен совпадать, нельзя вычислить сумму");
        }

        System.out.println("Введите множитель для умножения матриц (целое или дробное число)");
        float number = sc.nextFloat();

        float[][] mult_result1 = mult(matrix1, number);
        float[][] mult_result2 = mult(matrix2, number);

        System.out.println("Результат умножения 1-ой матрицы на множитель");
        printing(mult_result1);
        System.out.println("Результат умножения 2-ой матрицы на множитель");
        printing(mult_result2);
    }
}
