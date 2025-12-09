package task_7;

import java.util.Scanner;

public class ProstDelit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n > 1: ");
        long n = sc.nextLong();

        if (n <= 1) {
            System.out.println("n должно быть > 1");
            return;
        }

        System.out.println("Простые множители: ");
        factorize(n);
    }

    public static void factorize(long n) {
        // сначала выносим все двойки
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        // ищем нечётные делители
        long  d = 3;
        while (d * d <= n) {
            while (n % d == 0) {
                System.out.print(d + " ");
                n /= d;
            }
            d += 2; // только нечётные
        }

        // если осталось число > 1 — оно простое
        if (n > 1) {
            System.out.print(n);
        }
    }
}
