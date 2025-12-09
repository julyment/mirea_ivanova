package task_5;

import javax.swing.*;
import java.util.Scanner;

public class Summa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int n = sc.nextInt();
        System.out.println("Сумма цифр: " + sumDigits(n));
    }

    //рекурсия
    public static int sumDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumDigits(n / 10);
    }
}
