package task_1;

import java.util.Scanner;

public class TriSequence {
    public static void main(String[] args) {
        System.out.println("Введите длину треугольной последовательности: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int current = 1;
        int used = 0;

        System.out.println("Треугольная последовательноть длиной " + n);
        for (int i = 0; i < n; i++) {
            System.out.print(current + " ");
            used++;

            if (used == current) {
                current++;
                used = 0;
            }
        }
    }
}
