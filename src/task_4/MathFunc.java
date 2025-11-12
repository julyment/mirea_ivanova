package task_4;

import java.util.Scanner;

public class MathFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Вводим комплексное число");
        System.out.println("Введите реальную часть числа:");
        double real_part = sc.nextDouble();
        System.out.println("Введите мнимую часть числа (без i): ");
        double imag_part = sc.nextDouble();
        Complex numb = new Complex(real_part, imag_part);


        System.out.println("Какое действие вы хотите совершить?");
        System.out.println("1 — Возвести в степень");
        System.out.println("2 — Найти модуль");
        System.out.print("Ваш выбор: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Введите показатель степени: ");
                double exponent = sc.nextDouble();
                Complex result = numb.pow(exponent);
                System.out.println("\nРезультат:");
                System.out.println("("+ real_part + " + " + imag_part + "i"+ ")" + " ^ " + exponent + " = " + result);
            }
            case 2 -> {
                double modulus = numb.abs();
                System.out.println("\nМодуль комплексного числа:");
                System.out.println("|" + numb + "| = " + modulus);
            }
            default -> System.out.println("Некорректный выбор. Попробуйте снова.");
        }

        sc.close();
    }
}
