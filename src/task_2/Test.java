package task_2;

import java.util.Scanner;

public class Test {
    int count;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Test testing = new Test();
        System.out.println("Значение счетчика (метод экземпляра): " + testing.getCount());
        System.out.println("Изменим занчение count: ");
        int c = scan.nextInt();
        testing.count = c;
        System.out.println("Значение счетчика (метод экземпляра): " + testing.getCount());
        int fact = Test.factorial(3);
        System.out.println("Значение факториала (статическая функция): " + fact);

    }
    public int getCount() { return count; }
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }
}
