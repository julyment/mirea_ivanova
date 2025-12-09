import java.util.Scanner;

public class task_15 {
    static void printReverse(int n) {
        System.out.println(n % 10);

        if (n >= 10) {
            printReverse(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите натуральное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Вывод разрядов числа начиная с наименьшего: ");
        printReverse(n);
    }
}
