import java.util.Scanner;

public class task_14 {
    static void printDigits(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        }
        printDigits(n / 10);
        System.out.println(n % 10);
    }

    public static void main(String[] args) {
        System.out.println("Введите натуральное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Вывод разрядов числа начиная с наибольшего: ");
        printDigits(n);

    }
}
