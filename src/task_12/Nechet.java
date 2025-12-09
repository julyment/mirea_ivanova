package task_12;

import java.util.Scanner;

public class Nechet {
    static Scanner in = new Scanner(System.in);

    static void f() {
        int x = in.nextInt();

        if (x == 0) return;

        if (x % 2 == 1) {
            System.out.println(x + " - нечетное");
        }

        f();
    }

    public static void main(String[] args) {
        System.out.println("Вводите натуральные числа последовательности по одному через enter: ");
        f();
    }
}
