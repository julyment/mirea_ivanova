package task_9;

import java.util.Scanner;

public class No2Zero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число 0 в последовательности: ");
        int a = in.nextInt();
        System.out.println("Введите число 1 в последовательности: ");
        int b = in.nextInt();

        System.out.println("Число последовательностей: ");

        // Если нулей слишком много — последовательностей нет
        if (a > b + 1) {
            System.out.println(0);
            return;
        }

        System.out.println(C(b + 1, a));
    }
    static long C(int n, int k) {
        long res = 1;
        for (int i = 1; i <= k; i++) {
            res = res * (n - i + 1) / i;
        }
        return res;
    }
}
