import java.util.Scanner;

public class task_17 {
    static Scanner in = new Scanner(System.in);

    static int f() {
        int x = in.nextInt();

        if (x == 0) {
            return 0;
        }

        int maxTail = f();

        return Math.max(x, maxTail);
    }

    public static void main(String[] args) {
        System.out.println("Введите натуральные числа последовательности через enter: ");
        System.out.println(f() + " - максимум последовательности");

    }
}
