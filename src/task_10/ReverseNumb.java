package task_10;

import java.util.Scanner;

public class ReverseNumb {
    static int digits(int n) {
        if (n < 10) return 1;
        return 1 + digits(n / 10);
    }

    static int reverse(int n) {
        if (n < 10) return n;

        int last = n % 10;
        int rest = n / 10;
        int k = digits(rest);

        return last * (int)Math.pow(10, k)
                + reverse(rest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число, которое надо перевернуть: ");
        int a = sc.nextInt();
        System.out.println("Первернутое число: ");
        System.out.println(reverse(a));
    }

}
