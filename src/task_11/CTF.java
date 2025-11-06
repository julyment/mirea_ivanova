package task_11;

import java.util.Scanner;


public class CTF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите значение градусов Цельсия: ");
        double celsius = sc.nextDouble();

        double farengate = (celsius * (1.8)) + 32;
        double round_farengate = Math.round(farengate*100) / 100.0;
        System.out.println("Перевод из Цельсия в Фаренгеев: ");
        System.out.println(round_farengate);
        double kelvin = Math.round((celsius + 273.15) * 100) / 100.0;
        System.out.println("Перевод из Цельсия в градусы Кельвина: ");
        System.out.println("Z");
        System.out.println(kelvin);
    }
}
