import java.util.Scanner;

public class task_13 {
    static Scanner in = new Scanner(System.in);

    static void f() {
        int x = in.nextInt();

        if (x == 0) return;

        System.out.println("Нечетный порядеовый номер в последовательности у числа " + x);

        int skip = in.nextInt();
        if (skip == 0) return;

        f();
    }

    public static void main(String[] args) {
        System.out.println("Вводите члены последовательности по одному через enter: ");
        f();
    }
}
