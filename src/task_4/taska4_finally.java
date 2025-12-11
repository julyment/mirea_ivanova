package task_4;

import java.util.Scanner;

public class taska4_finally {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");

        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);

        } catch (NumberFormatException e) {
            // Срабатывает, если введено нецелое число:
            // Qwerty, 1.2 и т.п.
            System.out.println("Input is not a valid integer");

        } catch (ArithmeticException e) {
            // Срабатывает, если делим на ноль (ввод: 0)
            System.out.println("Attempted division by zero");

        } finally {
            // Блок finally выполняется ВСЕГДА:
            // - если исключение было и перехвачено
            // - если исключения не было
            // - даже если сработал один из catch
            System.out.println("Finally block is executed");
        }
    }

    public static void main(String[] args) {
        new taska4_finally().exceptionDemo();
    }
}
