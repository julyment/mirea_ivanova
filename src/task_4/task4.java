package task_4;

import java.util.Scanner;

public class task4 {
    static long count(int digitsLeft, int sum, boolean firstDigit) {
        if (digitsLeft == 0) {
            return (sum == 0) ? 1 : 0;
        }

        long res = 0;
        int from = firstDigit ? 1 : 0;

        for (int d = from; d <= 9; d++) {
            if (sum - d < 0) break;
            res += count(digitsLeft - 1, sum - d, false);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество цифр k: ");
        int k = in.nextInt();

        System.out.print("Введите требуемую сумму цифр s: ");
        int s = in.nextInt();

        System.out.println("Количество таких чисел: " + count(k, s, true));
    }
}
