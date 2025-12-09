package task_11;

import java.util.Scanner;

public class CountOne {
    static Scanner in = new Scanner(System.in);

//в данной функции подсчитывется кол-во чисел == 1 (по заданию), а не цифр, то есть 11 не будет учитываеться как две единицы
    static int f() {
        int x = in.nextInt();

        if (x == 0) {
            int y = in.nextInt();
            if (y == 0) return 0;     // конец
            return (y == 1 ? 1 : 0) + f();
        }

        return (x == 1 ? 1 : 0) + f();
    }

    public static void main(String[] args) {
        System.out.println("Вводите натуральные числа последовательности по одному через enter:");
        System.out.println(f());
    }
}
